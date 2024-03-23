package com.sena.servicesecurity.Service;


import com.sena.servicesecurity.Entity.Contract;
import com.sena.servicesecurity.IRepository.IBaseRepository;
import com.sena.servicesecurity.IRepository.IContractRepository;
import com.sena.servicesecurity.IService.IContractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService extends ABaseService<Contract> implements IContractService{

	@Override
	protected IBaseRepository<Contract, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	@Autowired
	private IContractRepository repository;
}
