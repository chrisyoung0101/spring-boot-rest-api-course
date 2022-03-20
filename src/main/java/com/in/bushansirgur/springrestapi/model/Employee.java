package com.in.bushansirgur.springrestapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {

    //The model maps the JSON data to the Java Object which in this case the model object will be Employee

    //JSON example :
//    {
//        "name": "Giggles",
//         "age": 28,
//         "location": "Greenland",
//         "email": "giggles@gmail.com",
//         "department": "Grocery"
//    }

    private String name;
    @JsonIgnore //age will not be returned in the response body
    private Long age;
    private String location;
    private String email;
    private String department;



}
