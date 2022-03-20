package com.in.bushansirgur.springrestapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    //@JsonProperty("full_name") //changes from name to full_name - json data must now match this - why is this useful?
    private String name;

    //@JsonIgnore //age will not be returned in the response body - useful for sensitive data
    private Long age;

    private String location;

    private String email;

    private String department;



}
