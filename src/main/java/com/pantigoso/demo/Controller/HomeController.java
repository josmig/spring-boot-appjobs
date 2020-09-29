package com.pantigoso.demo.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pantigoso.demo.Model.Vacante;
import com.pantigoso.demo.Service.IVacanteService;

@Controller
public class HomeController {
	
	@Autowired
	private IVacanteService serviceVacantes;
	
	@GetMapping("/")
	public String home(Model model) {
				
		return "home";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		
		var titulo ="Listado de profesiones";
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de Sistemas");
		lista.add("Contador");
		lista.add("Vendedor");
		lista.add("Arquitecto");

		model.addAttribute("empleo", lista);
		model.addAttribute("title",titulo);
		return "listado";		
	}
	
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		
		Vacante vacante = new Vacante();		
		vacante.setName("Ingeniero de Comunicaciones");
		vacante.setDescription("Se necesita ingeniero para dar soporte a intranet");
		vacante.setDate(new Date());
		vacante.setSalary(4300.00);
		
		model.addAttribute("vacante", vacante);
		
		return "detalle";
	}
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		
		List<Vacante> lista = serviceVacantes.buscarTodas();	
		model.addAttribute("vacante",lista);
		return "tabla";
	}
	//Metodo para que regrese una lista Vacante	
}
