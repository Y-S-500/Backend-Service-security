package com.sena.servicesecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.servicesecurity.Entity.Pais;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.IPaisRepository;
import com.sena.servicesecurity.IService.IPaisService;
@Service
public class PaisService extends ABaseService<Pais> implements IPaisService{


	
	@Autowired
	public IPaisRepository repository;

	@Override
	protected IBaseRepository<Pais, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	

}
