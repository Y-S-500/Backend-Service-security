package com.sena.servicesecurity.Entity;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais extends ABaseEntity{

	
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre_pais;
    
    @Column(name = "codigo", length = 50, nullable = false)
    private String codigo;

	public String getNombre_pais() {
		return nombre_pais;
	}

	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
    
 
  
}
