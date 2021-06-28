package com.employee.details.test;

import com.employee.details.model.EmployeePersonalDetails;
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
 * This test class is created for testing the Employee Personal data by using assertionEquals
 * @Exception throws exception
 */
public class EmployeePersonalDetailsTest {
    EmployeePersonalDetails emp=new EmployeePersonalDetails("Kala","Aluru","16-08-1974","Kadapa");
    @Before
    public void setUp() throws Exception{
    }

    @After
    public void tearDown() throws Exception{
    }

    /**
     * This method is created for testing Employee firstName
     */
    @Test
    public void testGetFirstName(){
        String expected="Kala";
        String actual=emp.getFirstName();
        assertEquals(expected,actual);

    }

    /**
     * This method is created for testing Employee lastName
     */
    @Test
    public void testGetLastName(){
        String expected="Aluru";
        String actual=emp.getLastName();
        assertEquals(expected,actual);
    }

    /**
     * This method is created for testing Employee date of birth
     */
    @Test
    public void testDob(){
        String expected="16-08-1974";
        String actual=emp.getDob();
        assertEquals(expected,actual);
    }

    /**
     * This method is created for testing Employee home address
     */
    @Test
    public void testAddress(){
        String expected="Kadapa";
        String actual=emp.getAddress();
        assertEquals(expected,actual);
    }
}
