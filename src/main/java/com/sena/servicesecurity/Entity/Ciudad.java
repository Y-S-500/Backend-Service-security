package com.sena.servicesecurity.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "ciudad")
public class Ciudad extends ABaseEntity{
	
	 @Column(name = "nombre", length = 50, nullable = false)
	    private String nombre;
	    
	    @Column(name = "codigo", length = 50, nullable = false)
	    private String codigo;
	    
	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "departamento_id", nullable = false)
	    private Departamento departamento;
	



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getCodigo() {
			return codigo;
		}



		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}



		public Departamento getDepartamento() {
			return departamento;
		}



		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}


}
