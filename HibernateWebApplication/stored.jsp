<%@ page import="com.fst.HibernateWebApplication.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="obj" class="com.fst.HibernateWebApplication.Pojo"/>    
<jsp:setProperty property="*" name="obj"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	        Dao d = new Dao();
		
		out.print(d.insert(obj));
	%>
</body>
</html>