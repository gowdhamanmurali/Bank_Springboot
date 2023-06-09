package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BankRepository extends JpaRepository<Bank, Integer>{

	@Query(value="select branch from bank where ifsc=:ifsc", nativeQuery = true)
	public String getIfsc(int ifsc);
}
