<%--
  Created by IntelliJ IDEA.
  User: Кислюк
  Date: 02.08.2018
  Time: 1:34
  To change this template use File | Settings | File Templates.
--%>

<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Title</title>
</head>
<body>


<c:if test="${!empty resultObject}">
    <table class="table table-striped table-bordered table-hover">
        <thead class="thead-dark">
        <th scope="row">Person ID</th>
        <th scope="row">firstName</th>
        <th scope="row">lastName</th>
       
        </thead>
        <tbody>
        <c:forEach  items="${resultObject}" var="person">
            <tr>
                <td>${person.id}</td>
                <td>${person.firstName}</td>
                <td>${person.lastName}</td>
                    <%--<td><a href="<c:url value='/edit?id=${person.id}' />" >Edit</a></td>--%>
                    <%--<td><a href="<c:url value='deleteContact?id=${person.id}' />" >Delete</a></td>--%>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
</body>
</html>
