package com.employee.details.model;

import com.employee.details.validations.ConstantData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
/**
 * This is a POJO class for Employee Personal Details
 * @Getter @Setter used instead of writing getters and setters with the help of lombok
 * @NoArgsConstructor @AllArgsConstructor used instead of writing constructors with and without arguments with the help of lombok
 */
public class EmployeePersonalDetails {
    @NotBlank(message = ConstantData.msg)
    String firstName;
    @NotNull(message = ConstantData.message)
    String lastName;
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    String dob;
    @NotBlank(message = ConstantData.msg)
    String address;


}
