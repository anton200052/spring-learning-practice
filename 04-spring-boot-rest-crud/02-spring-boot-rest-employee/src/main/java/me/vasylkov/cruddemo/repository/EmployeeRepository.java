package me.vasylkov.cruddemo.dao;

import me.vasylkov.cruddemo.employee.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>
{

}
