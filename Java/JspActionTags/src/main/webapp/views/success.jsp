<%@ page language="java"  isELIgnored="false"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>SUCCESS PAGE</h1>

<%=  session.getAttribute("emp")%>
<br>
Employee Data From EmployeeJSP :
<br>

${ emp }

<br>

Using JSP getProperty  Action Tag 

<br>
<jsp:useBean id="emp"  class="com.wipro.pojo.Employee"   scope="session" ></jsp:useBean>
<jsp:getProperty property="eid" name="emp"/> <br>
<jsp:getProperty property="ename" name="emp"/> <br>
<jsp:getProperty property="salary" name="emp"/> <br>

</body>
</html>