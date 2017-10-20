package com.imfe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imfe.model.Provincia;
import com.imfe.model.ProvRepo;

@Service
public class ProvServiceImpl implements ProvService {
	
	// Inyectamos repositorio de la BBDD para poder usarlo aquí
	@Autowired
	private ProvRepo ProvRepo; 
	
	
	//Servicio listar toda la tabla Provincia
	@Override
	public Iterable<Provincia> listar() {
		
		/*Iterable<Provincia> lista= ProvRepo.findAll();*/ //Tambien se puede hacer así
		
		return ProvRepo.findAll();
	}


	//Servicio para listar el contenido de la provincia cuya id es la pasada por parámetro
	@Override
	public Provincia listar(Integer id) {
		
		return ProvRepo.findOne(id);
	}
	

	// Método que recibe un nombre de provincia y devuelve un objeto provincia cuyo nombre es pasado por parámetro
	@Override
	public Provincia listar(String nombre) {
		//Listo todas las provincias
		Provincia provinciaEncontrada=null;
		Iterable<Provincia> lista=ProvRepo.findAll();
		
		//Recorro con un for each toda las provincias hasta encontrar la provincia cuyo nombre es igual al pasado por parámetro
		for(Provincia prov:lista) {
			if(prov.getNombre().equals(nombre)) {
				provinciaEncontrada=prov;
			}
		}
		
		return provinciaEncontrada;
		
	}
	
}
