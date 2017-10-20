package com.imfe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="provincias")
public class Provincia {
	//Atributos
	@Id
	@GeneratedValue
	private int id;
	//Código postal de la provincia con clave única,longitud 2 y no null
	@Column(unique=true,length=2,nullable=false)
	private String cod;
	private String nombre;
	@ColumnDefault("'ninguna'") //Valor por defecto de la columna bandera
	private String bandera;
	
	
	//Constructores
	public Provincia() {
		this.id=0;
		this.cod="-";
		this.nombre="-";
		this.bandera="-";
		
	}


	//Métodos
	
	//Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCod() {
		return cod;
	}


	public void setCod(String cod) {
		this.cod = cod;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getBandera() {
		return bandera;
	}


	public void setBandera(String bandera) {
		this.bandera = bandera;
	}

	//ToSTring
	@Override
	public String toString() {
		return "Provincia [id=" + id + ", cod=" + cod + ", nombre=" + nombre + ", bandera=" + bandera + "]";
	}
	
	
	
	

}
