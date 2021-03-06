package com.jlm.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("pathResultado", "Esta es la variable (@PathVariable)");
		return "variables/index";
	}
	
	@GetMapping("/string/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado en la ruta es: "+ texto);
		 return "variables/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}")
	public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
		model.addAttribute("pathResultado", "Esta es la variable (@PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es: "+ texto+
				" el numero enviado es "+numero);
		 return "variables/ver";
	}


}
