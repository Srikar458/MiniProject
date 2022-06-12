package com.pms.process.controller;

 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


import com.pms.bean.*;
import com.pms.process.exception.AadharNumberNotFound;
import com.pms.process.exception.AuthorizationException;
import com.pms.process.exception.PensionerDetailException;
import com.pms.process.model.PensionDetail;
import com.pms.process.model.ProcessPensionInput;
import com.pms.process.repo.AuthClient;
import com.pms.process.service.ProcessPensionServiceImpl;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
@RestController
@Validated

public class ProcessPensionController extends BaseController {
	
	Logger log = LoggerFactory.getLogger(ProcessPensionController.class);

	@Autowired
	ProcessPensionServiceImpl processPensionServiceImpl;
	
	@Autowired
	private AuthClient authClient;
	
	@PostMapping("/ProcessPension")
	@ApiOperation(notes = "Process the pension and returns pension ammount", value = "Process the pension")
	public PensionDetail getPensionDetail(
			@RequestHeader(value = "Authorization", required = true) 
			String requestTokenHeader,
			@RequestBody ProcessPensionInput processPensionInput) throws AuthorizationException, PensionerDetailException, AadharNumberNotFound
	{
			log.debug("In process pension controller");
			log.debug("Token Passed: "+requestTokenHeader );
			if(authClient.authorizeTheRequest(requestTokenHeader).isValid()) 
			{
				log.debug("authorization success");
				log.info("Token valid :"+authClient.authorizeTheRequest(requestTokenHeader).isValid());
				return processPensionServiceImpl.processPension(requestTokenHeader,processPensionInput);
			}
			else
			{
				log.error("Invalid Token");
				throw new AuthorizationException("Not allowed, Please pass a valid token");
			}
	}
	
}
