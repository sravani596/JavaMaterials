<%@ page language="java"  isELIgnored="false"  import="com.wipro.pojo.Employee"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>SUCCESS JSP PAGE</h1>


JSP Scriplet : <br>
<%

Employee e1 = (Employee) 	session.getAttribute("emp");

	out.print(e1);
	
	out.print(e1.getEid() +" "+e1.getEname() +" "+e1.getSalary());


%>
<br>
JSP Expression: <br>

<%= session.getAttribute("emp")%>


<br>
EL-Expression:
<br>

${ emp }




</body>
</html>