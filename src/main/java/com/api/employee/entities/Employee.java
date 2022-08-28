package com.api.employee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Employee {
	
	
	private @Id @GeneratedValue int employeeId;
	@NotNull
	private String employeeName;
	private String job;
	@NotNull
	private long phoneNumber;
	private String emailId;

}
