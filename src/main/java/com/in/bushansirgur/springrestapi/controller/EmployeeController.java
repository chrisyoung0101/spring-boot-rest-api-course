package com.in.bushansirgur.springrestapi.controller;

import com.in.bushansirgur.springrestapi.model.Employee;
import com.in.bushansirgur.springrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {


    //Note : this controller is all the other controller handler methods put together
    //Each of the other controllers were created to simply single out each handler method and add more detailed notes...

    @Autowired
    private EmployeeService employeeService;



    //getting values from applications.properties
    //note : {app.name: Employee Tracker} where Employee Tracker is a default value.  This is useful if our property value is commented out which would cause an error without the default to fall back on.
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    //returns the app name and version
    @GetMapping("/version")
    public String getAppDetails () {
        return appName+" - "+appVersion;
    }


    // Employee Handler Methods

    //localhost:8080/main-employees
    @GetMapping("/main-employees")
    public List<Employee> getEmployees () {
        return employeeService.getEmployees();
    }

    //http://localhost:8080/main-employees/858
    @GetMapping("/main-employees/{id}")
    public String getEmployee (@PathVariable Long id) {
        return "Fetching the employee details for the id "+id;
    }

    //localhost:8080/main-employees
    @PostMapping("/main-employees")
    public String saveEmployee (@RequestBody Employee employee) {
        return "saving the employee details for the database "+employee;
    }

    //localhost:8080//main-employees/6548
    @PutMapping("/main-employees/{id}")
    public Employee updateEmployee (@PathVariable Long id, @RequestBody Employee employee) {
        System.out.println("updating the employee data for the id "+id);
        return employee;
    }

    //localhost:8080/main-employees?id=345345
    @DeleteMapping("/main-employees")
    public String deleteEmployee (@RequestParam("id") Long id) {
        return "Deleting the employee details for the id "+id;
    }

}


//Jackson API : JSON property & @JsonIgnore are the two most important
//What if we wanted to not return on of the properties we get from the HTTP Response JSON?
// Like ignore sensitive data from the user object that could have the email, password, etc?

