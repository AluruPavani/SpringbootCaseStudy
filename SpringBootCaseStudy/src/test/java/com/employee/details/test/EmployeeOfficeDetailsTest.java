package com.employee.details.test;

import com.employee.details.model.EmployeeOfficeDetails;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest()
/**
* This test class is created for testing the Employee Office data by using assertionEquals
* @Exception throws exception
*/
public class EmployeeOfficeDetailsTest {
    EmployeeOfficeDetails emp=new EmployeeOfficeDetails("588795","Chennai","6", "JavaEE");
    @Before
    public void setUp() throws Exception{

    }
    @After
    public void tearDown() throws Exception{

    }
    /**
     * This method is created for testing Employee id
     */
    @Test
    public void testGetId(){
    String expected="588795";
    String actual=emp.getId();
    assertEquals(expected,actual);

}
    /**
     * This method is created for testing Employee work location
     */
    @Test
    public void testGetWorkingLocation(){
    String expected="Chennai";
    String actual=emp.getWorkLocation();
    assertEquals(expected,actual);
}
    /**
     * This method is created for testing Employee work experience
     */
    @Test
    public void testGetYearsOfExperience(){
        String expected="6";
        String actual=emp.getYearsOfExperience();
        assertEquals(expected,actual);
    }

    /**
     * This method is created for testing Employee primary skills
     */
    @Test
    public void testPrimarySkills(){
        String expected="JavaEE";
        String actual=emp.getPrimarySkills();
        assertEquals(expected,actual);
    }
}