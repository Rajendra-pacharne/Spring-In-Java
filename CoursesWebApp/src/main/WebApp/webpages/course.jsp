<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Courses</title>
</head>
<body>
    <h1>List of Courses // ${cname}</h1>
    
    <table>
        <tr>
            <th>Course ID</th>
            <th>Course Name</th>
            <th>Instructor</th>
        </tr>
        
        <%-- Iterate over the list of courses and display each course --%>
        <c:forEach var="course" items="${courses}">
            <tr>
                <td>${course.id}</td>
                <td>${course.name}</td>
                <td>${course.instructor}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
