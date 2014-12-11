<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: shoaib
  Date: 2/10/14
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div class="panel panel-info">

    <div class="panel-heading">
        <h3 class="panel-title">Student Details</h3>
    </div>
    <br>
    <div class="panel-body">
            <div class="alert alert-success">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                <p>Student details validated successfully.</p>
            </div>
            <table class="table table-bordered table-hover">
                <tr><th>Name</th><td>${command.name}</td></tr>
                <tr><th>Age</th> <td>${command.age}</td></tr>
                <tr><th>City</th><td>${command.city}</td></tr>
                <tr><th>School name</th><td>${command.school.schoolName}</td></tr>
                <tr><th>Subjects</th>
                    <td>
                        <c:forEach var="subject" items="${command.subjects}" varStatus="status">
                            ${subject}
                            <c:if test="${status.index ne (fn:length(subjects)-1)}">
                                ,
                            </c:if>
                        </c:forEach>

                    </td>
                </tr>
            </table>
    </div>
</div>
</body>
</html>
