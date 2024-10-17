<%@ page language="java" isELIgnored="false"  import="com.wipro.springboot1.beans.Employee"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

 Employee emp = (Employee) session.getAttribute("emp");

out.print(emp);

%>

<br>

<%=  session.getAttribute("emp") %>


<br>

${emp}





</body>
</html>