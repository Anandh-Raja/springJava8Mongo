package com.wipro.smjeight.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.smjeight.Exceptions.ResourceNotFoundException;
import com.wipro.smjeight.model.Data;
import com.wipro.smjeight.model.Dataa;
import com.wipro.smjeight.service.DataService;



@RestController
public class DataController {
	@Autowired
private DataService service;
	@PostMapping("/addData")
	public ResponseEntity<Data> createEntry(@RequestBody Data data)throws ResourceNotFoundException{
		Data s=service.createData(data);
		
		return ResponseEntity.ok(s);
	}
	@GetMapping("/getData/{id}")
	public ResponseEntity<Optional<Data>> getEntry(@PathVariable UUID id)throws ResourceNotFoundException{
		Optional<Data> s=service.getByUUID(id);
		return ResponseEntity.ok(s);
	}
	@GetMapping("/crtdata/{id}")
	public ResponseEntity<Dataa> retriveEntry(@PathVariable UUID id)throws ResourceNotFoundException{
		Optional<Data> d=service.getByUUID(id);
		//Data s=service.getByID(id);
		char b[]=new char[100];
		String str,finals="";
		boolean vn = false;int n;
		Optional<Integer> Hn=null;
		if(d.isPresent()) {
			List<Integer> list=d.get().getFindHighest();
			Hn=list.stream().max((i,j)->i.compareTo(j));
			 str=d.get().getFindSpecialCharacter();
			 int i,p,c=0;
			 char s[]=str.toCharArray();
			 int l=s.length;
			 for(i=0;i<l;i++) {
				 p=s[i];
				 if(p>=65&&p<=90||p>=97&&p<=122||p>=48&&p<=57) {
					 continue;
				 }else {
					 b[c]=s[i];
					 c++;
				 }
			 }
			 n=Integer.parseInt(d.get().getValidNumber());
			 if(n%1==0) {
				 vn=true;
			 }else
			 {
				 vn=false;
			 }
			System.out.println("SpecialCharacter:"+String.valueOf(b));
			System.out.println("HighestNumber"+Hn+"ValidNumber"+vn);
	 		finals=String.valueOf(b);
		}
		Dataa result=new Dataa(finals,Hn,vn);
		return ResponseEntity.ok(result);
	} 
}
