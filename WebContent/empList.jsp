<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>获取员工的全部信息</title>
</head>
<body>
     <table border="2">
     
     	<tr>
     	    <td>id</td>
     		<td>姓名</td>
     		<td>年龄</td>
     		<td>住址</td>
     	    <td>工作</td>
     	</tr>
     	<c:forEach items="${queryAll }" var="list">
              <tr>
              	<td>${list.id }</td>
              	<td>${list.name }</td>
              	<td>${list.age }</td>
              	<td>${list.address }</td>
              	<td>${list.job }</td>
              </tr>      
        </c:forEach>
     
     </table>
</body>
</html>