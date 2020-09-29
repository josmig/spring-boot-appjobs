package com.pantigoso.demo.Service;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pantigoso.demo.Model.Vacante;

@Service
public class VacanteServiceImpl implements IVacanteService{

	private List<Vacante> lista = null;
	//Metodo(Constructor) para que regrese una lista Vacante
	public VacanteServiceImpl() {
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Vacante>();
		
		try {
			Vacante vacante1 =new Vacante();
			vacante1.setId(1);
			vacante1.setName("Area de Comunicaciones");
			vacante1.setDescription("Encargado del mantenimiendo y funcionamiento de las Redes Sociales en la empresa");
			vacante1.setDate(formato.parse("10-03-2020"));
			vacante1.setSalary(8090.50);
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
	}
	
	@Override
	public List<Vacante> buscarTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Vacante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		for(Vacante v:lista) {
			if(v.getId() == id) {
				return v;
			}
		}
		return null;
	}

	
}
