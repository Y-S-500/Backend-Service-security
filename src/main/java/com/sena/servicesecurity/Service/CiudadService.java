package com.sena.servicesecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.servicesecurity.Entity.Ciudad;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.ICiudadRepository;
import com.sena.servicesecurity.IService.ICiudadService;

@Service
public class CiudadService extends ABaseService<Ciudad> implements ICiudadService{

	@Override
	protected IBaseRepository<Ciudad, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	@Autowired
	public ICiudadRepository repository;

}
