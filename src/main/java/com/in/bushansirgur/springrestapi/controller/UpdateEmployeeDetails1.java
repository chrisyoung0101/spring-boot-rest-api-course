package com.in.bushansirgur.springrestapi.controller;

import com.in.bushansirgur.springrestapi.model.Employee;
import org.springframework.web.bind.annotation.*;

//Combination of @Controller + @ResponseBody
@RestController
public class UpdateEmployeeDetails1 {

    //Request is from client
    //Response is from server

    @PutMapping("/employees6/{id}")
    public Employee updateEmployee (@PathVariable Long id, @RequestBody Employee employee) {
        System.out.println("updating the employee data for the id "+id);
        return employee;
    }

}


//Stopped at 1:00