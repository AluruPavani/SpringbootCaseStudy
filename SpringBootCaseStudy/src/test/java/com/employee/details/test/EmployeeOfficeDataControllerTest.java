package com.employee.details.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@SpringBootTest()
/**
* This test class is created for testing Employee Office details
*/
public class EmployeeOfficeDataControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    /**
    * This method is created for testing the employee Office data inserted using the jsonPath and get url
    * @Exception throws exception
    */
    public void testEmployeeData() throws Exception {
        mockMvc.perform(get("/employeeOfficeData")).andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.id").value("983498")).andExpect(jsonPath("$.workLocation").value("Chennai"))
                .andExpect(jsonPath("$.yearsOfExperience").value("4")).andExpect(jsonPath("$.primarySkills").value("Java"));

    }

}
