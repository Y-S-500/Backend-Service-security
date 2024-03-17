package com.sena.servicesecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.servicesecurity.Entity.Departamento;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.IDepartamentoRepository;
import com.sena.servicesecurity.IService.IDepartamentoService;

@Service
public class DepartamentoService  extends ABaseService<Departamento> implements IDepartamentoService{

	@Override
	protected IBaseRepository<Departamento, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
	@Autowired
	public IDepartamentoRepository repository;
}
