package com.sena.servicesecurity.Entity;

import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "module")
public class Module  extends ABaseEntity { 
	@Column(name = "name", length = 50, nullable = false)
    private String name;
    
    @Column(name = "route", length = 50, nullable = false)
    private String route;
    
    @Column(name = "description", length = 50, nullable = false, unique = true)
    private String description;
    
    @ManyToMany/*(fetch = FetchType.LAZY, targetEntity = Role.class, cascade = CascadeType.PERSIST)*/
    // @ManyToMany(fetch = FetchType.LAZY)
       @JoinTable(name = "module_role",
         joinColumns = @JoinColumn(name = "module_id"),
         inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> role = new HashSet<>();
    
    @ManyToMany
       @JoinTable(name = "module_view",
         joinColumns = @JoinColumn(name = "module_id"),
         inverseJoinColumns = @JoinColumn(name = "view_id"))
     private Set<View> view = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    
}
