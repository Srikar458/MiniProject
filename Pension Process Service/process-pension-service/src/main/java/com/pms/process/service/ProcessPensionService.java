package com.pms.process.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.bean.ProcessPensionBean;
import com.pms.process.exception.AadharNumberNotFound;
import com.pms.process.exception.AuthorizationException;
import com.pms.process.exception.PensionerDetailException;
import com.pms.process.model.PensionDetail;
import com.pms.process.model.ProcessPensionInput;

@Service
public interface ProcessPensionService {
	
	@Autowired
	
	ProcessPensionBean getPensionerDetailsByAadhar(long aadharcardid);
	ProcessPensionBean getPensionProcess(ProcessPensionBean ProcessPensionBean);
	ProcessPensionBean longPension(String username, String password);
	
	Integer calculatePensionAmmount(double basicsalary,double deanessalllowance,int fixagenygovt);
	
	public PensionDetail processPension(String requestTokenHeader,ProcessPensionInput processPensionInput) throws PensionerDetailException, AuthorizationException, AadharNumberNotFound;
	
	
	
}
