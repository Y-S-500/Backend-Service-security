package com.sena.servicesecurity.Entity;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country extends ABaseEntity{

	
    @Column(name = "name", length = 50, nullable = false)
    private String name_country;
    
    @Column(name = "code", length = 50, nullable = false)
    private String code_country;

	public String getName_country() {
		return name_country;
	}

	public void setName_country(String name_country) {
		this.name_country = name_country;
	}

	public String getCode_country() {
		return code_country;
	}

	public void setCode_country(String code_country) {
		this.code_country = code_country;
	}




	
 
  
}
