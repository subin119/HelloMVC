<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image:url(/HelloMVC/img/정유미.jpg); color: #000;">
	<c:if test="${not empty Allemployees }">
		<c:forEach items="${Allemployees}" var="employee">
			${employee.employeeId} | ${employee.firstName} | ${employee.lastName} | ${employee.hireDate}
			| ${employee.salary} | ${employee.departmentId} <br/>
		</c:forEach>
	</c:if>
	
	<c:if test="${not empty employee}">
		${employee.employeeId} | ${employee.firstName} | ${employee.lastName} | ${employee.hireDate}
			| ${employee.salary} | ${employee.departmentId} <br/>
	</c:if>
</body>
</html>