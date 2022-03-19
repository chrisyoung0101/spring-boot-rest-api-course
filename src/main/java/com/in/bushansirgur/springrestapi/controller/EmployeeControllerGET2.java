package com.in.bushansirgur.springrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Combination of @Controller + @ResponseBody
@RestController
public class EmployeeControllerGET2 {

    //localhost:8080/employees where /employees is the URI

    //handler methods
    @GetMapping(value = "/employees2")  //URI value gets mapped to GET method & then the method is executed
    public String getEmployees () {
        return "displaying list of employees2";
    }

}
