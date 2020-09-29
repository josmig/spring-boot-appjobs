package com.pantigoso.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pantigoso.demo.Model.Vacante;
import com.pantigoso.demo.Service.IVacanteService;

@Controller
@RequestMapping(value = "/vacantes")
public class VacantesController {
	
	@Autowired
	private IVacanteService serviceVacante;
	
	
	@GetMapping("/ver/{id}")
	public String verDetalle(@PathVariable("id") int id,Model model) {		
		
		Vacante vacante = serviceVacante.buscarPorId(id);
		
		System.out.println("Vacante : " + vacante);			
		model.addAttribute("vacante", vacante);
		
		//Buscar los detalles de la vacante en la BD
		
		return "detalle";
	}
	
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idVacante, Model model) {
		System.out.println(idVacante);
		model.addAttribute("idVacante", idVacante);
		return "mensaje";
	}
}
