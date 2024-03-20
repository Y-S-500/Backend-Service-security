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
    private String name_country;
    
    @Column(name = "code", length = 50, nullable = false)
    private String code;

	public String getName_country() {
		return name_country;
	}

	public void setName_country(String name_country) {
		this.name_country = name_country;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
