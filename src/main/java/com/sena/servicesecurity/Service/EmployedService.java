package com.sena.servicesecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.servicesecurity.Entity.Employed;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.IEmployedRepository;
import com.sena.servicesecurity.IService.IEmployedService;

@Service
public class EmployedService extends ABaseService<Employed> implements IEmployedService{

	@Override
	protected IBaseRepository<Employed, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	@Autowired
	private IEmployedRepository repository;

}
