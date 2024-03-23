package com.sena.servicesecurity.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.servicesecurity.IService.IContractService;
import com.sena.servicesecurity.Entity.Contract;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/contract")
public class ContractController extends ABaseController<Contract,IContractService>{

	protected ContractController(IContractService service) {
		super(service, "Contract");
		// TODO Auto-generated constructor stub
	}

}
