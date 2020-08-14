package com.pantigoso.demo.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pantigoso.demo.Model.Vacante;

@Controller
public class HomeController {
	
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
		
		List<Vacante> lista = getVacante();
		model.addAttribute("vacante",lista);
		return "tabla";
	}
	
	//Metodo para que regrese una lista Vacante
	private List<Vacante> getVacante(){
		
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		List<Vacante> lista = new LinkedList<Vacante>();
		
		try {
			Vacante vacante1 =new Vacante();
			vacante1.setId(1);
			vacante1.setName("Area de Comunicaciones");
			vacante1.setDescription("Encargado del mantenimiendo y funcionamiento de las Redes Sociales en la empresa");
			vacante1.setDate(formato.parse("10-03-2020"));
			vacante1.setSalary(1500.50);
			vacante1.setImagen("empresa1.png");
			vacante1.setDestacado(1);
			
			Vacante vacante2 =new Vacante();
			vacante2.setId(2);
			vacante2.setName("Area de Redes e Informatica");
			vacante2.setDescription("Encargado del mantenimiendo de redes de la empresa");
			vacante2.setDate(formato.parse("10-10-2020"));
			vacante2.setSalary(2300.50);
			vacante2.setDestacado(0);
			vacante2.setImagen("empresa2.png");
						
			Vacante vacante3 =new Vacante();
			vacante3.setId(3);
			vacante3.setName("Programador Jnr. Java Fullstack");
			vacante3.setDescription("Elboracion de Software y mantenimiento");
			vacante3.setDate(formato.parse("20-05-2020"));
			vacante3.setSalary(3500.50);
			vacante3.setDestacado(1);
			
			Vacante vacante4 =new Vacante();
			vacante4.setId(4);
			vacante4.setName("Psicolog para GTH");
			vacante4.setDescription("Encargado de la verificacion de los empleados");
			vacante4.setDate(formato.parse("14-01-2020"));
			vacante4.setSalary(1500.50);
			vacante4.setDestacado(1);
			vacante4.setImagen("empresa3.png");
			
			Vacante vacante5 =new Vacante();
			vacante5.setId(5);
			vacante5.setName("Limpieza");
			vacante5.setDescription("Limpieza de la empresa");
			vacante5.setDate(formato.parse("15-03-2020"));
			vacante5.setSalary(1000.50);
			vacante5.setDestacado(0);
			
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
			lista.add(vacante5);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}
		return lista;
	}
}
