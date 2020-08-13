package com.pantigoso.demo.Model;

import java.util.Date;

public class Vacante {

	private Integer id;
	private String name;
	private String description;
	private Date date;
	private double salary;
	private Integer destacado;
	
	

	public Vacante () {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Vacante [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", salary="
				+ salary + "]";
	}
	
	public Integer getDestacado() {
		return destacado;
	}

	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}
	
	
}
