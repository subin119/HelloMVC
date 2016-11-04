package com.ktds.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ktds.dao.IndexDao;
import com.ktds.dao.impl.IndexDaoImpl;
import com.ktds.service.IndexService;
import com.ktds.vo.EmployeesVO;

//Annotation
@Controller
public class IndexController {
	
	private IndexService indexService;
	
	public void setIndexService(IndexService indexService) {
		this.indexService = indexService;
	}
	
	// http://localhost:8080/HelloMVC/로 접속하면 실행됨.
	@RequestMapping("/")
	public String viewIndexPage(){
		return "index"; //jsp의 이름
	}
	
	@RequestMapping("/sub")
	public ModelAndView viewSubPage(){
		ModelAndView view = new ModelAndView("sub");//페이지를 지정하는 두번째 방법
		
		/*//페이지를 지정하는 첫번째 방법
		view.setViewName("sub");
		view.setViewName("main");*/
		
		// Servlet의 reqeust.setAttribute(k,v)와 같다. sddd
		view.addObject("key1","value1");
		view.addObject("key2","value2");
		view.addObject("key3","value3");
		view.addObject("key4","value4");
		
		return view;
	}
	@RequestMapping("/param")
	public ModelAndView viewParamPage(@RequestParam(required=false, defaultValue="") String param){
		System.out.println(param);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("param");
		view.addObject("param1", param);
		return view;	
	}
	
	@RequestMapping("/now")
	public ModelAndView ViewNowDateTimePage() {
		ModelAndView view = new ModelAndView();
		
		String nowDateTime = indexService.getNowDateTime();
		
		view.setViewName("now");
		view.addObject("nowDateTime", nowDateTime);
		return view;
	}
	
	@RequestMapping("/hr/employees")
	public ModelAndView viewAllEmployeesPage() {
		
		List<EmployeesVO> employees = indexService.getAllEmployees();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("hr/employees");
		view.addObject("Allemployees", employees);
		return view;
	}
	
	@RequestMapping("/hr/employee/{employeeId}")
	public ModelAndView viewEmployeePage(@PathVariable String employeeId) {
		
		EmployeesVO employee = indexService.getEmployeeOfEmployeeId(employeeId);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("hr/employees");
		view.addObject("employee", employee);
		return view;
	}
	
	@RequestMapping("/hr/addNewEmployee")
	public String viewAddNewEmployeePage() {
		return "hr/addNewEmployee";
	}
	
	@RequestMapping("/hr/doAddEmployeeAction")
	public ModelAndView doAddEmployeeAction(EmployeesVO employee) {
		ModelAndView view = new ModelAndView();
		
		boolean isSuccess = indexService.addNewEmployee(employee);
		view.setViewName("redirect:/hr/employees");
		
		return view;
	}
}
