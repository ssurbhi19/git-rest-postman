package com.employee.rest;

import com.employee.dao.EmployeeRepository;
import com.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @ResponseBody
    @RequestMapping(value="/addEmp",method = RequestMethod.POST)
    public Employee addEmployee(@RequestBody Employee emp)
    {
        employeeRepository.save(emp);
        return emp;
    }
    @ResponseBody
    @RequestMapping(value="/getEmp",method = RequestMethod.GET)
    public List<Employee> getAllEmployee()
    {
        return employeeRepository.getAll();
    }
    @ResponseBody
    @RequestMapping(value="/findByID/{id}")
    public Employee getUserById(@PathVariable int id) {
        return employeeRepository.getOne(id);
    }
}




