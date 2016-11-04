package com.ktds.service.impl;

import java.util.List;

import com.ktds.biz.IndexBiz;
import com.ktds.service.IndexService;
import com.ktds.vo.EmployeesVO;

public class IndexServiceImpl implements IndexService{

	private IndexBiz indexBiz;

	public void setIndexBiz(IndexBiz indexBiz) {
		this.indexBiz = indexBiz;
	}
	
	@Override
	public String getNowDateTime() {
		return indexBiz.getNowDateTime();
	}
	
	@Override
	public List<EmployeesVO> getAllEmployees() {
		return indexBiz.getAllEmployees();
	}
	
	@Override
	public EmployeesVO getEmployeeOfEmployeeId(String employeeId) {
		return indexBiz.getEmployeeOfEmployeeId(employeeId);
	}
	
	@Override
	public boolean addNewEmployee(EmployeesVO employee) {
		return indexBiz.addNewEmployee(employee);
	}
	
}
