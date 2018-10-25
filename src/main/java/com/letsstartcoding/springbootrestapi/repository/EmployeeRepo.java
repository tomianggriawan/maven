package com.letsstartcoding.springbootrestapi.repository;

import com.letsstartcoding.springbootrestapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 10/25/2018.
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Employee findOne(Long empid);
}
