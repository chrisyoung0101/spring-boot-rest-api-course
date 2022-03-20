package com.in.bushansirgur.springrestapi.controller;

import com.in.bushansirgur.springrestapi.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {


    //Note : this controller is all the other controller handler methods put together
    //Each of the other controllers were created to simply single out each handler method and add more detailed notes...

    //localhost:8080/main-employees
    @GetMapping("/main-employees")
    public String getEmployees () {
        return "displaying the list of employees";
    }

    //http://localhost:8080/main-employees/858
    @GetMapping("/main-employees/{id}")
    public String getEmployee (@PathVariable Long id) {
        return "Fetching the employee details for the id "+id;
    }

    //localhost:8080/main-employees
    @PostMapping("/main-employees")
    public String saveEmployee (@RequestBody Employee employee) {
        return "saving the employee details for the database "+employee;
    }

    //localhost:8080//main-employees/6548
    @PutMapping("/main-employees/{id}")
    public String updateEmployee (@PathVariable Long id, @RequestBody Employee employee) {
        return "updating the employee data for the id "+id;
    }

    //localhost:8080/main-employees?id=345345
    @DeleteMapping("/main-employees")
    public String deleteEmployee (@RequestParam("id") Long id) {
        return "Deleting the employee details for the id "+id;
    }

}
