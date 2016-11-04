package com.ktds.biz.impl;

import java.util.List;

import com.ktds.biz.IndexBiz;
import com.ktds.dao.IndexDao;
import com.ktds.vo.EmployeesVO;

public class IndexBizImpl implements IndexBiz {
	private IndexDao indexDao;

	public void setIndexDao(IndexDao indexDao) {
		this.indexDao = indexDao;
	}
	
	@Override
	public String getNowDateTime() {
		return indexDao.getNowDateTime();
	}
	
	@Override
	public List<EmployeesVO> getAllEmployees() {
		return indexDao.getAllEmployees();
	}
	
	@Override
	public EmployeesVO getEmployeeOfEmployeeId(String employeeId) {
		return indexDao.getEmployeeOfEmployeeId(employeeId);
	}
	
	@Override
	public boolean addNewEmployee(EmployeesVO employee) {
		return indexDao.addNewEmployee(employee) > 0;
	}
}
