package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
	@Service
	public class BankService {
		@Autowired
		BankDao badao;
		public String addDetails(List<Bank> a){
			return badao.addDetails(a);
		}
		public List<Bank> getDetails() {
			return badao.getDetails();
		}
}
	