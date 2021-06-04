package com.proyecto.pac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.pac.models.entity.Productos;
import com.proyecto.pac.models.service.IProductoService;


import java.util.List;

@Controller
public class HomeController {
	@Autowired
	private IProductoService productoService;

	@GetMapping({"/index","/home","/",})
	public String index() {
		return "home";
	}
	
	
	@GetMapping({"/ubicanos"})
	public String ubicanos() {
		return "ubicanos";
	}
	
	@GetMapping("/listarProductos")
	public String listarProductos(Model model) {
		List<Productos> listadoProductos = productoService.listarTodos();
		
 		model.addAttribute("titulo", "Lista de productos");
 		model.addAttribute("productos", listadoProductos);
		return "listarProductos";
		
	}
	

}
