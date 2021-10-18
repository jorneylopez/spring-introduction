package com.jlm.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jlm.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
		

	@GetMapping({ "/index", "/", "", "/home" })
	public String index(Model model) {
		model.addAttribute("titulo", "Spring Framework");
		model.addAttribute("body", "Desde Spring Framework");
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Jorney");
		usuario.setApellido("Lopez");
		usuario.setEmail("jorney95@live.com");

		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Spring Framework");
		model.addAttribute("body", "Perfil de usuario: ".concat(usuario.getNombre()));

		return "perfil";
	}

	@RequestMapping("/listar")
	public String listar(Model model) {

		model.addAttribute("titulo", "Spring Framework");

		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> llenarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Jorney", "Lopez", "jl@live.com"));
		usuarios.add(new Usuario("Daniel", "Lopez", "dl@live.com"));
		usuarios.add(new Usuario("Jordan", "Lopez", "jdlm@live.com"));
		return usuarios;
	}

//	@GetMapping({"/index","/","/home"})
//	public String index(Map<String, Object> map) {
//		map.put("titulo", "Spring Framework");
//		map.put("body", "Hola Desde Spring Framework");
//		return "index";
//	}

}
