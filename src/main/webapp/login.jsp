<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>friendbook</title>
</head>
<body>
${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
<form action="<c:url value='/j_spring_security_check'/>" method="post">
    Username<input type="text" name="j_username"/><br/>
    Password<input type="password" name="j_password"/><br/>
    <input type="submit"/>
</form>
</body>
</html>