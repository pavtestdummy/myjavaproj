package com.testone.first;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanApprovalEndpoint {
	
	@GetMapping("/loancheck/{years}")
	public ResponseEntity<LoanResponse> getLoanStatus(@PathVariable("years")int years)
	{
	     LoanResponse rs=null;
		System.out.println("in loancheck get loan stagus "+years);
		if(years < 5)
	        rs=new LoanResponse(0, years, 0);
		else
			rs=new LoanResponse(years*2000, years, 1);
		
		return ResponseEntity.ok(rs);
	}

}
