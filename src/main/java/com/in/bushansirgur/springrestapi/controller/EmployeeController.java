package com.in.bushansirgur.springrestapi.controller;

import com.in.bushansirgur.springrestapi.model.Employee;
import com.in.bushansirgur.springrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/v1") //this makes the URI : localhost:8080/api/v1/main-employees  ***see application.properties***
public class EmployeeController {


    //Note : this controller is all the other controller handler methods put together
    //Each of the other controllers were created to simply single out each handler method and add more detailed notes...



    /*
    /**********************Demo Stuff*****************************/

    //getting values from applications.properties
//    //note : {app.name: Employee Tracker} where Employee Tracker is a default value.  This is useful if our property value is commented out which would cause an error without the default to fall back on.
//    @Value("${app.name}")
//    private String appName;
//
//    @Value("${app.version}")
//    private String appVersion;
//
//    //returns the app name and version
//    @GetMapping("/version")
//    public String getAppDetails () {
//        return appName+" - "+appVersion;
//    }

    /*
    /**********************Employee Handler Methods*****************************/


    @Autowired
    private EmployeeService employeeService;

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


//notes

//Jackson API : JSON property & @JsonIgnore are the two most important
//What if we wanted to not return on of the properties we get from the HTTP Response JSON?
// Like ignore sensitive data from the user object that could have the email, password, etc?

/*
* entity class will map to the table
* dependencies to connect to mysql db :
* mysql connector
* data jpa : java persistence api - which is a specification - default implementation of data jpa is hibernate - dat jpa
* is an ORM framework that allows us to use the java object (and not have to write sql queries) to persist the data to the db
* configure datasource in this java app
*
* */