<%@ page language="java"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Employee JSP Page working as Controller </h1>



<%-- 
<jsp:useBean id="emp"  class="com.wipro.pojo.Employee"   scope="session" ></jsp:useBean>

<jsp:setProperty property="eid" name="emp"   param="eid"/>
<jsp:setProperty property="ename" name="emp"  param="ename"/>
<jsp:setProperty property="salary" name="emp"  param="salary"/>

<jsp:include page="success.jsp"></jsp:include>
 --%>

<%-- <jsp:forward page=""></jsp:forward> --%>


<jsp:useBean id="emp"  class="com.wipro.pojo.Employee"   scope="session" ></jsp:useBean>


<jsp:setProperty property="*" name="emp"  />

<jsp:include page="success.jsp"></jsp:include>


</body>
</html>