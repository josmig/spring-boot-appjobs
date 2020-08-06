package com.pantigoso.demo.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		var name = "Panti";
		var mensaje = "Bienvenidos al sistem de mensajeria";		
		model.addAttribute("titulo", "Home |".concat(name));
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("fecha", new Date());
		return "home";
	}

}
