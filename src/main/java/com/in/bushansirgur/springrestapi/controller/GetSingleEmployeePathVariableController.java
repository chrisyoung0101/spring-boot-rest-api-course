package com.in.bushansirgur.springrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Combination of @Controller + @ResponseBody
@RestController
public class GetSingleEmployeePathVariableController {

        //NOTE : adding a number to the URI so they can be unique to each controller otherwise this shit ain't gonna work
                //Like : "/employees3/{id}"

        //localhost:8080/employees

        //min 29:00
        // In order to GET or DELETE a single record from the server we need to pass variables like custId, etc
        // Here's a couple ways we can send data from client to server:
        // 1) Path Variable
        // 2) Request Param

        //handler methods

        //get single employee with path variable
        //user provides the id
        //localhost:8080/employees/12
        @GetMapping("/employees3/{id}")  //NOTE : when variable name matches in both the URI and the Param you don't need to pass in the name to @PathVariable so could look like (@PathVariable Long id)
        public String getEmployee (@PathVariable("id") Long id) {
            return "Fetching the employee details or the id "+id;
        }

    }

