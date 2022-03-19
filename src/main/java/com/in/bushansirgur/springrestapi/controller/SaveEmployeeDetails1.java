package com.in.bushansirgur.springrestapi.controller;

import com.in.bushansirgur.springrestapi.model.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveEmployeeDetails1 {

    /*
    NOTE : to set up JSON in Postman use Body, check raw and select Test = JSON
    NOTE : in order to use the model with Postman we need to use the exact field names which will be handled by the Jackson API
    */

    //user or client sends the employee data inside the Request Body
    //HTTP POST & PUT methods support the Request Body which contains the employee data
    @PostMapping("/employees5")
    public String saveEmployee (@RequestBody Employee employee) { //Employee is the model for our JSON data
        return "saving the employee details to the database "+employee;
    }

}
