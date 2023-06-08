package com.sk.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDTO {
	private Long id;
	private String name;
	private String address;
	private Date createdAt;
	private Date updatedAt;
}
