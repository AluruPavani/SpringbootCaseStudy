package com.employee.details.controller;

import com.employee.details.model.EmployeePersonalDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * This class created for implementing get and post methods
 */
@RestController
public class EmployeePersonalDataController {
    /**
     * This method created for inserting employee Office data and returns the data
     */
    @RequestMapping(value = "/employeePersonalData", method = RequestMethod.GET)
    public EmployeePersonalDetails createData() {

        EmployeePersonalDetails emp = new EmployeePersonalDetails();
        emp.setFirstName("Venky");
        emp.setLastName("Aluru");
        emp.setDob("01-06-1973");
        emp.setAddress("Badvel");

        return emp;
    }
    /**
     * This method is created for posting the employee Personal data and returns the message written in the body
     */
    @RequestMapping(value = "/employeePersonal", method = RequestMethod.POST)
    public ResponseEntity<Object> addEmployee(@RequestBody EmployeePersonalDetails employeePersonalDetails) {

        return new ResponseEntity<>("Employee data is created successfully", HttpStatus.CREATED);
    }
}
