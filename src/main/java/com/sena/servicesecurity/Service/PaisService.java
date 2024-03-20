package com.sena.servicesecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.servicesecurity.Entity.Country;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.ICountryRepository;
import com.sena.servicesecurity.IService.ICountryService;
@Service
public class PaisService extends ABaseService<Country> implements ICountryService{


	
	@Autowired
	public ICountryRepository repository;

	@Override
	protected IBaseRepository<Country, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	

}
