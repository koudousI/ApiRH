package bj.springboot.ocproject.ApiRH.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bj.springboot.ocproject.ApiRH.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}