package com.ktds.biz;

import java.util.List;

import com.ktds.vo.EmployeesVO;

public interface IndexBiz {

	public String getNowDateTime();

	public List<EmployeesVO> getAllEmployees();

	public EmployeesVO getEmployeeOfEmployeeId(String employeeId);

	public boolean addNewEmployee(EmployeesVO employee);

}
