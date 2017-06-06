package com.infix.vish.contractController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infix.vish.contract.Contract;


@RestController
@RequestMapping(ContarctController.CONTRACT_BASE_URI)
public class ContarctController {
	
	public static final String CONTRACT_BASE_URI = "infix/vish/contracts";
	
	@RequestMapping(value = "{contractNumber}")
	public Contract getContract(@PathVariable final int contractNumber){
		
		Contract contract = new Contract();
		contract.setName("Vishwa");
		contract.setId(contractNumber);
		return contract;
		
	}

}
