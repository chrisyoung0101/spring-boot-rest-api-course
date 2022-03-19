package com.in.bushansirgur.springrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//Combination of @Controller + @ResponseBody
@RestController
public class EmployeeControllerGET2 {

    //NOTE : adding a number to the URI so they can be unique to each controller otherwise this ain't gonna work
    //Like : "/employees3/{id}"

    //localhost:8080/employees where /employees is the URI

    //handler methods
    @GetMapping(value = "/employees2")  //URI value gets mapped to GET method & then the method is executed
    public String getEmployees () {
        return "displaying list of employees2";
    }

}
