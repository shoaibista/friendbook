<%@page contentType="text/html; ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <script src="<c:url value='/js/jquery.js'/>" type="text/javascript"></script>
    <script>


    </script>
</head>
<title>Student Spring MVC Application</title>
<body>
<div class="panel panel-info">
    <div class="panel-heading">
        <h3 class="panel-title">Student Registration Form</h3>
    </div>
    <br>



    <%--<c:choose>--%>
        <%--<c:when test="${fn:length(command.school.schoolName) eq 0}">--%>
            <%--<c:set var="schoolName" value=""></c:set>${command.school.schoolName} hiii--%>
        <%--</c:when>--%>
        <%--<c:otherwise>--%>
            <%--<c:set var="schoolName" value="${command.school.schoolName}"></c:set>${fn:length(command.school.schoolName)}--%>
        <%--</c:otherwise>--%>
    <%--</c:choose>--%>

    <%--Student form start here--%>
    <form:form action=" ${pageContext.request.contextPath}/studentRegistration" commandName="command"
               role="form" cssClass="form-horizontal">

        <c:if test="${hasErrors}">
            <div class="alert alert-danger">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                <form:errors path="*"></form:errors>
            </div>
        </c:if>

        <div class="panel-body">
            <div class="well well-lg">
                <div class="form-group">
                    <label for="name">Name</label>
                    <form:input path="name" id="name" class="form-control"></form:input>
                </div>
                <div class="form-group">
                    <label for="age">Age</label>
                    <form:input path="age" id="age" class="form-control" type="number"></form:input>
                </div>
                <div class="form-group">
                    <label for="name">City</label>
                    <form:input path="city" id="city" class="form-control"></form:input>
                </div>
                <div class="form-group">
                    <label for="school">School Name</label>
                    <form:input path="school" id="school" value="${command.school.schoolName}" class="form-control"></form:input>
                </div>
                <div class="form-group">
                    <label for="subjects">Subjects</label>
                    <form:checkboxes path="subjects" items="${subjects}" id="subjects"/>
                </div>
                <button type="submit" class="btn btn-default btn-success">Save</button>
            </div>
        </div>
    </form:form>
</div>
<c:url value="/css/bootstrap.min.css"/>
</body>
</html>