package com.imfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.imfe.model.Provincia;
import com.imfe.services.ProvService;

@Controller
public class ProvController {
	
	// Inyectamos los servicios
		@Autowired
		private ProvService ProvService; 
	
	/**
	 * 
	 * @return -> Este mapeo nos lleva al listado de provincias sin bandera
	 */
	@RequestMapping(value="/provincias")
	public String listado(Model model) {
		
		/*Llamamos al servicio listar y añadimos la lista a la variable 'lista usando iterable
		Iterable<Provincia> lista=ProvService.listar();*/
		
		//Metemos el resultado del servicio listar en un array para poder usar en tablaProvincias.html la función '.size()'
		List<Provincia> lista=(List<Provincia>)ProvService.listar();
		
		//Pasamos resultado a listado.html
		model.addAttribute("resultado",lista);
		
		return "tablaProvincias";
	}
	
	/**
	 * Mapeo que nos lleva a la descripción de la provincia pasada por id
	 * @param model -> Envía a provincia.html el objeto provincia
	 * @param id -> id de la provincia obtenida por la url
	 * @return -> El objeto se envía a provincia.html
	 */
	@RequestMapping(value="/provincia/id/{id}")
	public String provid(Model model, @PathVariable(name="id")Integer id) {
		
		Provincia prov=ProvService.listar(id);
		
		model.addAttribute("resultado", prov);
		
		return "fichaProvincia";
	}
	
	/**
	 * Mapeo que nos lleva a la descripción de la provincia pasada 
	 * @param model ->Envía a provincia.html el objeto provincia
	 * @param nombre ->nombre de la provincia obtenida por la url
	 * @return -> El objeto se envía a provincia.html
	 */
	@RequestMapping(value="/provincia/nom/{nombre}")
	public String provname(Model model, @PathVariable(name="nombre")String nombre) {
		
		Provincia prov=ProvService.listar(nombre);
		
		model.addAttribute("resultado", prov);
		
		return "fichaProvincia";
	}


	
}
