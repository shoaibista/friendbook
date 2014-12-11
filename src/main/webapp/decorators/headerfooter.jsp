<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<tags:dwrjavascript object="student"/>
<tags:javascriptlink name="jquery"/>
<tags:javascriptlink name="bootstrap.min"/>
<tags:javascriptlink name="jquery-ui"/>
<tags:stylesheetlink name="bootstrap.min"/>
<tags:stylesheetlink name="stickyfooter"/>
<tags:stylesheetlink name="style"/>
<tags:stylesheetlink name="jquery-ui"/>

<html>
<meta charset=”utf-8”>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
    <title>
        <decorator:title default="Welcome"/>
    </title>
    <link rel="shortcut icon" type="image/png" href="http://hello.eboy.com/eboy/wp-content/uploads/2013/09/RZR-Akuma-09k-16.png"/>
    <script>
        var student_list=function(){
            var resultsToBeReturned = new Array();
            var callbackProxy = function(results) {
                for (var i = 0; i < results.length; i++) {
                    resultsToBeReturned.push(results[i]);
                }
            };
            /** disable async req ! */
            var callMetaData = { callback:callbackProxy, async:false};
            student.allRegisteredStudents(callMetaData);
            return resultsToBeReturned;
        }

        var studentList=student_list()
        function getAllStudents(){
            $( "#studentAutocompleter" ).autocomplete({
                source:studentList
            });
        }
    </script>
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
