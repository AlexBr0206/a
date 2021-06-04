package com.proyecto.pac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

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

}
