package com.letsstartcoding.springbootrestapi.dao;

import com.letsstartcoding.springbootrestapi.model.Employee;
import com.letsstartcoding.springbootrestapi.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by User on 10/25/2ed018.
 */
@Service
public class EmployeeDao {

    @Autowired
    EmployeeRepo employeeRepo;

    // save Employee
    public Employee save(Employee emp){
        return employeeRepo.save(emp);
    }

    // search all Employee
    public List<Employee> findAll(){
        return employeeRepo.findAll();
    }

    // get Employee
    public Employee findOne(Long empid){
        return employeeRepo.findOne(empid);
    }

    // delete an Employee
    public void delete(Employee emp){
        employeeRepo.delete(emp);
    }

}
