package com.employee.details.model;
import com.employee.details.validations.ConstantData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.util.bcel.Const;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
/**
* This is a POJO class for Employee Personal Details
* @Getter @Setter used instead of writing getters and setters with the help of lombok
* @NoArgsConstructor @AllArgsConstructor used instead of writing constructors with and without arguments with the help of lombok
*/
public class EmployeeOfficeDetails {
    @Size(min=1,max=10,message= ConstantData.size)
    String id;
    @NotBlank(message = ConstantData.msg)
    String workLocation;
    @Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message=ConstantData.digit)
    String yearsOfExperience;
    @NotNull(message = ConstantData.message)
    String primarySkills;

}
