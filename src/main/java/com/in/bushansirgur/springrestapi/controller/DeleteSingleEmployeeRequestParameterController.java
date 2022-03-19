package com.in.bushansirgur.springrestapi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Combination of @Controller + @ResponseBody
@RestController
public class DeleteSingleEmployeeRequestParameterController {

<<<<<<< HEAD
    //NOTE : adding a number to the URI so they can be unique to each controller otherwise this ain't gonna work
=======
    //NOTE : adding a number to the URI so they can be unique to each controller otherwise this shit ain't gonna work
>>>>>>> origin/master
    //Like : "/employees3/{id}"

    //localhost:8080/employees

    //min 35:00
    // In order to GET or DELETE a single record from the server we need to pass variables like custId, etc
    // Here's a couple ways we can send data from client to server:
    // 1) Path Variable
    // 2) ***Request Param***

    //handler methods


    //Anything after ? is the request param
    //id is the key and 34 is the value
    //Multiple request params : ?id=34&name=Bob

    //localhost:8080/employees?id=34
    //note that browser can not handle DELETE method so you'll want to use Postman
    //browser only supports the GET request
    @DeleteMapping("/employees4")
    public String deleteEmployee (@RequestParam("id") Long id) {  //
        return "Deleting employee details for the id "+id;
    }

}
