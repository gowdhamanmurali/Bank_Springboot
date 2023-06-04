package com.example.demo;
import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	@Repository
	public class BankDao {
		@Autowired
		BankRepository baRepo;
		public String addDetails(List<Bank> a) {
			baRepo.saveAll(a);
			return "SuccessFully Saved";
		}
		public List<Bank>getDetails(){
			return baRepo.findAll();
		}
}
