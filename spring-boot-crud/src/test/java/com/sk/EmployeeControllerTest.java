package com.sk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sk.entity.Employee;
import com.sk.service.EmployeeService;

@WebMvcTest
class EmployeeControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	@Autowired
	private EmployeeService employeeService;

	private static ObjectMapper mapper;

	@Test
	void testSetAllEmployees() throws Exception {
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setId(1L);
		employee.setName("Arun");
		employees.add(employee);
		Mockito.when(employeeService.getEmployees()).thenReturn(employees);
		mockMvc.perform(get("/employees"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$", Matchers.hasSize(1)))
			.andExpect(jsonPath("$[0].name", Matchers.equalTo("Arun")));
	}

	@Test
	void testSaveEmployee() throws Exception {
		Employee employee = new Employee();
		employee.setId(1L);
		employee.setName("Arun");
		mapper = new ObjectMapper();
		Mockito.when(employeeService.addEmployee(ArgumentMatchers.any())).thenReturn(employee);
		String json = mapper.writeValueAsString(employee);
		mockMvc.perform(post("/employee")
			.contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
			.content(json).accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isCreated())
			.andExpect(jsonPath("$.id", Matchers.equalTo(1)))
			.andExpect(jsonPath("$.name", Matchers.equalTo("Arun")));
	}

	@Test
	void testDeleteEmployee() throws Exception {
		Employee employee = new Employee();
		employee.setId(2L);
		employee.setName("John");
		mapper = new ObjectMapper();
		Mockito.when(employeeService.updateEmployee(ArgumentMatchers.any())).thenReturn(employee);
		String json = mapper.writeValueAsString(employee);
		mockMvc.perform(put("/putMapping")
			.contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
			.content(json).accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.id", Matchers.equalTo(2)))
			.andExpect(jsonPath("$.name", Matchers.equalTo("John")));
	}
	
//	@Test
//    void testDeleteExample() throws Exception {
//        Mockito.when(employeeService.deleteEmployee(ArgumentMatchers.any())).thenReturn("Employee is deleted");
//        MvcResult requestResult = mockMvc.perform(delete("/deleteMapping").param("student-id", "1"))
//                .andExpect(status().isOk()).andExpect(status().isOk()).andReturn();
//        String result = requestResult.getResponse().getContentAsString();
//        assertEquals(result, "Student is deleted");
//    }
	
}
