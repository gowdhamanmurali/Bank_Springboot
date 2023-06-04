package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BankController {
	@Autowired
	BankService baser;
	@PostMapping(value="/value")
	public String addDetails(@RequestBody List<Bank> a) {
		return baser.addDetails(a);
	}
	@GetMapping(value="/value1")
	public List<Bank>getDetails(){
		return baser.getDetails();
	}
}
