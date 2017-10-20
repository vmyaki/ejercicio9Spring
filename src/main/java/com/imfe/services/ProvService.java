package com.imfe.services;

import com.imfe.model.Provincia;

public interface ProvService {
	
	/**
	 * Método que me lista todos los datos de la tabla provincias
	 * @return Servicio para listar el listado de provincias.
	 */
	public Iterable<Provincia> listar ();
	
	
	/**
	 * Método que recibe un id de provincia y devuelve un objeto provincia cuya id es la pasada por parámetro
	 * @param int id -> recibe el id de la provincia que hay que listar sus datos
	 * @return -> Devuelve el objeto provincia cuya id es la pasada por el parámetro 
	 */
	public Provincia listar(Integer id);
	
	
	/**
	 * Método que recibe un nombre de provincia y devuelve un objeto provincia cuyo nombre es pasado por parámetro
	 * @param nombre -> nombre de la provincia que deseamos buscar
	 * @return -> devuelve el objeto provincia cuyo nombre es el pasado por el parámetro
	 */
	public Provincia listar(String nombre);

}
