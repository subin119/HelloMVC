package com.ktds.dao;

import java.util.List;

import com.ktds.vo.EmployeesVO;

public interface IndexDao {
	
	public String getNowDateTime();

	public List<EmployeesVO> getAllEmployees();

	public EmployeesVO getEmployeeOfEmployeeId(String employeeId);

	public int addNewEmployee(EmployeesVO employee);
}
