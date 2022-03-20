package com.in.bushansirgur.springrestapi.service;

import com.in.bushansirgur.springrestapi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    //create a list where we can add objects of type Employee
    private static List<Employee> list = new ArrayList<>();

    static{

        //create new object
        Employee e = new Employee();
        //set the values
        e.setName("Felix");
        e.setAge(37L);
        e.setDepartment("Grocery");
        e.setEmail("felix@gmail.com");
        e.setLocation("Phoenix");
        //add the object to the list
        list.add(e);

        e = new Employee();
        e.setName("Gisele");
        e.setAge(46L);
        e.setDepartment("Produce");
        e.setEmail("gisele@gmail.com");
        e.setLocation("Scottsdale");
        list.add(e);

        e = new Employee();
        e.setName("Wilber");
        e.setAge(18L);
        e.setDepartment("front-end");
        e.setEmail("wilber@gmail.com");
        e.setLocation("Glendale");
        list.add(e);

        e = new Employee();
        e.setName("Jasmina");
        e.setAge(23L);
        e.setDepartment("Deli");
        e.setEmail("jasmina@gmail.com");
        e.setLocation("Tempe");
        list.add(e);

        e = new Employee();
        e.setName("Bobbymax");
        e.setAge(64L);
        e.setDepartment("supplements");
        e.setEmail("bobbymax@gmail.com");
        e.setLocation("Paradise Valley");
        list.add(e);
    }

    @Override
    public List<Employee> getEmployees() {
        return list;
    }


}
