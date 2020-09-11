package com.pantigoso.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/vacantes")
public class VacantesController {
	
	@GetMapping("/ver/{id}")
	public String verDetalle(@PathVariable("id") int idVacante,Model model) {		
		System.out.println("IdVacante : " + idVacante);			
		model.addAttribute("idVacante", idVacante);
		
		//Buscar los detalles de la vacante en la BD
		
		return "vacantes/detalle";
	}
	
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idVacante, Model model) {
		System.out.println(idVacante);
		model.addAttribute("idVacante", idVacante);
		return "mensaje";
	}
}
