package com.ktds.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ktds.dao.IndexDao;
import com.ktds.vo.EmployeesVO;

public class IndexDaoImpl extends SqlSessionDaoSupport implements IndexDao{

	public String getNowDateTime(){
		return getSqlSession().selectOne("indexDao.getNowDateTime");
	}
	
	@Override
	public List<EmployeesVO> getAllEmployees() {
		return getSqlSession().selectList("indexDao.getAllEmployees");
	}
	
	@Override
	public EmployeesVO getEmployeeOfEmployeeId(String employeeId) {
		return getSqlSession().selectOne("indexDao.getEmployeeOfEmployeeId", employeeId);
	}
	
	@Override
	public int addNewEmployee(EmployeesVO employee) {
		return getSqlSession().insert("indexDao.addNewEmployee", employee);
	}
	
}
