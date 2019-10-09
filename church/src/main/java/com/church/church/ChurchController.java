package com.church.church;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.church.church.MarshallingClass.Finances;
import com.church.church.MarshallingClass.Members;



@RestController
public class ChurchController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	/*........................................................................................
									MEMBERS
    .........................................................................................*/
	
	@RequestMapping("/members")                                   
	private Members[] allMembers() {
		Members[] member = restTemplate.getForObject("http://all-members/members", Members[].class);
		
		return member;
	}
	
	@RequestMapping("/memberByName/{id}")
	private Members memberByName(@PathVariable String id) {
		Members members = restTemplate.getForObject("http://all-members/oneMember/"+id, Members.class);
		return members;
	}
	
	
	@PostMapping("/AddMember")
	private Members addMember(@RequestBody Members member) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Members>entity=new HttpEntity<Members>(member,headers);
		return restTemplate.postForObject("http://all-members/addMember", entity, Members.class);
		
	}  
	
	@PutMapping("/updateMember/{id}")
	private Members updateMember(@PathVariable String id,@RequestBody Members member) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Members>entity=new HttpEntity<Members>(member,headers);
		return restTemplate.exchange("http://all-members/update/"+id, HttpMethod.PUT, entity, Members.class).getBody();
		
	}
	
	@DeleteMapping("/deleteMember/{id}")
	private Members deleteMember(@PathVariable String id) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Members>entity=new HttpEntity<Members>(headers);
		return restTemplate.exchange("http://all-members/delete/"+id, HttpMethod.DELETE, entity, Members.class).getBody();
		
	} 
	
	/*........................................................................................
								FINANCES
	............................................................................................*/
	
	
	@RequestMapping("/finances")                                   
	private Finances[] allFinancials() {
		Finances[] members = restTemplate.getForObject("http://financials/all", Finances[].class);
		return members;
	}
	
	@RequestMapping("/financesByName/{id}")
	private Finances financerByName(@PathVariable String id) {
		Finances members = restTemplate.getForObject("http://financials/getOne/"+id, Finances.class);
		return members;
	}
	
	
	@PostMapping("/AddFinance")
	private Finances addFinance(@RequestBody Finances finance) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Finances>entity=new HttpEntity<Finances>(finance,headers);
		return restTemplate.postForObject("http://financials/inserting", entity, Finances.class);
		
	}  
	
	@PutMapping("/updateFinance/{id}")
	private Finances updateFinance(@PathVariable String id,@RequestBody Finances finance) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Finances>entity=new HttpEntity<Finances>(finance,headers);
		return restTemplate.exchange("http://financials/updating/"+id, HttpMethod.PUT, entity, Finances.class).getBody();
		
	}
	
	@DeleteMapping("/deleteFinance/{id}")
	private Finances deleteFinance(@PathVariable String id) {
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Finances>entity=new HttpEntity<Finances>(headers);
		return restTemplate.exchange("http://financials/delete/"+id, HttpMethod.DELETE, entity, Finances.class).getBody();
		
	} 
	
	
}
