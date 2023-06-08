package com.sk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sk.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query("SELECT e FROM Employee e WHERE id = ?1 AND name = ?2")
	List<Employee> findByIdAndName(Long id, String name);
	
}
