package com.in.bushansirgur.springrestapi.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//annotation makes this class responsible for HTTP requests
//Server sends requests to this class
//
@Controller
public class EmployeeControllerGET1 {

    //NOTE : adding a number to the URI so they can be unique to each controller otherwise this ain't gonna work
    //Like : "/employees3/{id}"

    //localhost:8080/employees where /employees is the URI

    //handler methods
    @RequestMapping(value = "/employees1", method = RequestMethod.GET)  //URI value gets mapped to GET method & then the method is executed
    //each time we make a request we should expect a response
    @ResponseBody  //allows us to return the response from this method - needed in RESTful web services
    public String getEmployees () {
        return "displaying list of employees1";
    }


}
