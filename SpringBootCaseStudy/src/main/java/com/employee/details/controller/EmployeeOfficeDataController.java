package com.employee.details.controller;

import com.employee.details.model.EmployeeOfficeDetails;
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
public class EmployeeOfficeDataController {
    /**
     * This method created for inserting employee Office data and returns the data
     */
    @RequestMapping(value = "/employeeOfficeData", method = RequestMethod.GET)
    public EmployeeOfficeDetails addData() {

        EmployeeOfficeDetails emp1 = new EmployeeOfficeDetails();
        emp1.setId("983498");
        emp1.setWorkLocation("Chennai");
        emp1.setYearsOfExperience("4");
        emp1.setPrimarySkills("Java");

        return emp1;
    }

    /**
    * This method is created for posting the employee Office data and returns the message written in the body
    */
    @RequestMapping(value = "/employeeOffice", method = RequestMethod.POST)
    public ResponseEntity<Object> createEmployee(@RequestBody EmployeeOfficeDetails employeeOfficeDetails) {

        return new ResponseEntity<>("Employee data is created successfully", HttpStatus.CREATED);
    }

}
