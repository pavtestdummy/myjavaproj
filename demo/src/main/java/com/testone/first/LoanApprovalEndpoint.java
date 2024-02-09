package com.testone.first;

import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties.Restclient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class LoanApprovalEndpoint {

	@GetMapping("/loancheck/{years}")
	public ResponseEntity<LoanResponse> getLoanStatus(@PathVariable("years")int years)
	{
	     LoanResponse rs=null;
		System.out.println("in loancheck get loan stagus 3.2.2 "+years);
		if(years < 5)
	        rs=new LoanResponse(0, years, 0);
		else
			rs=new LoanResponse(years*2000, years, 1);
		
		return ResponseEntity.ok(rs);
	}


	@GetMapping("/postmsg/{id}")
	public ResponseEntity<TestPost> getPostMsg(@PathVariable("id")int id)
	{
	     
		TestPost tp=null;
		String uriBase="https://jsonplaceholder.typicode.com/posts/";
		RestClient restClient=RestClient.create();
		System.out.println(" in post test "+id);
		tp=restClient.get()		
				  .uri(uriBase + id)
				  .retrieve()
				  .body(TestPost.class);
		
		return ResponseEntity.ok(tp);
		
	}

}
