package com.in.bushansirgur.springrestapi.model;

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
    private Long age;
    private String location;
    private String email;
    private String department;



}
