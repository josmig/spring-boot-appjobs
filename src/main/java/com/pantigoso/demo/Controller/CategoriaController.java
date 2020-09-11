package com.pantigoso.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/categorias")
public class CategoriaController {
	
	 @RequestMapping(value = "/index", method = RequestMethod.GET)
	 public String mostrarIndex(Model model) {
		 return "categorias/listCategorias";
	 }
	 
	 @RequestMapping(value = "/create" , method = RequestMethod.GET)
	 public String crear() {
		 return "categorias/formCategoria";		 
	 }
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	 public String guardar( @RequestParam("name")String nombre, 
			 				@RequestParam("desc")String descripcion) {
		 
		 System.out.println("Categoria : ".concat(nombre));
		 System.out.println("Descripción : ".concat(descripcion));
		 
		 return "categorias/listCategorias";
	 }
	
}
