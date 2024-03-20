package com.sena.servicesecurity.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "city")
public class City extends ABaseEntity{
	@Column(name = "name", length = 50, nullable = false)
    private String name_city;
    
    @Column(name = "code", length = 50, nullable = false)
    private String code_city;

	

	    
	    public String getName_city() {
		return name_city;
	}

	public void setName_city(String name_city) {
		this.name_city = name_city;
	}

	public String getCode_city() {
		return code_city;
	}

	public void setCode_city(String code_city) {
		this.code_city = code_city;
	}

		@ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "department_id", nullable = false)
	    private Department department;

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}
	




}
