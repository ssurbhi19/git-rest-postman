package com.employee.dao;
import com.employee.entity.Employee;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class EmployeeRepository
{
    HashMap<Integer, Employee> employeeRepository=new HashMap<>();

    public void save(Employee employee)
    {
        employeeRepository.put(employee.getId(),employee);
    }
    public List<Employee> getAll()
    {
        List<Employee> employees=new ArrayList<Employee>();
        for (Map.Entry mapElement : employeeRepository.entrySet())
        {
            employees.add(((Employee)mapElement.getValue()));
        }
        return employees;
    }
    public Employee getOne(int id)
    {
        if(employeeRepository.containsKey(id))
        {
            return employeeRepository.get(id);
        }
        else
            return null;
    }
}




