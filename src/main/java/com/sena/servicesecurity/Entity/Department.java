package com.sena.servicesecurity.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "department")
public class Department extends ABaseEntity{
	

	  @Column(name = "name", nullable = false, unique = true)
	    private String name_department;
	    
	@Column(name = "code", nullable = false)
	    private String code_department;
	


	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName_department() {
		return name_department;
	}

	public void setName_department(String name_department) {
		this.name_department = name_department;
	}

	public String getCode_department() {
		return code_department;
	}

	public void setCode_department(String code_department) {
		this.code_department = code_department;
	}

	

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;
	
}

