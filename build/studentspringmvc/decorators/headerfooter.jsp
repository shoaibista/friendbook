<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="decorator" %>
<%@ taglib uri="http://java.sun.com/jstl/core"
           prefix="c" %>
<html>
<meta charset=”utf-8”>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
    <title>
        <decorator:title default="Welcome"/>
    </title>
    <link rel="shortcut icon" type="image/png" href="http://hello.eboy.com/eboy/wp-content/uploads/2013/09/RZR-Akuma-09k-16.png"/>
    <link href="<c:url value='/css/bootstrap.min.css'/>" rel="stylesheet">
    <script src="<c:url value='/js/jquery.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/js/bootstrap.min.js'/>" type="text/javascript"></script>
    <link href="<c:url value='/css/stickyfooter.css'/>" rel="stylesheet">
    <link href="<c:url value='/css/style.css'/>" rel="stylesheet">
    <decorator:head/>
</head>
<body style="background-color: #f7f7f7;">
<div id="wrap">
    <jsp:include page="header.jsp"/>
    <div class="container">
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8"><decorator:body /></div>
            <div class="col-md-2"></div>
        </div>
    </div>
</div><%--wrap ends here--%>
<jsp:include page="footer.jsp"/>


</body>
</html>
