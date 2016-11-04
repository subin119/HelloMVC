package com.ktds.service;

import java.util.List;

import com.ktds.vo.EmployeesVO;

public interface IndexService {

	public String getNowDateTime();

	public List<EmployeesVO> getAllEmployees();

	public EmployeesVO getEmployeeOfEmployeeId(String employeeId);

	public boolean addNewEmployee(EmployeesVO employee);

}
