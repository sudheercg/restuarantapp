<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Restaurant List</title>
</head>
<body>
    <h1>Restaurant List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
            <th>Details</th>
        </tr>
        <c:forEach var="restaurant" items="${restaurants}">
            <tr>
                <td>${restaurant.restaurantID}</td>
                <td>${restaurant.restaurantName}</td>
                <td>${restaurant.city}</td>
                <td><a href="${pageContext.request.contextPath}/restaurants/${restaurant.restaurantID}">View Details</a></td>
            </tr>
        </c:forEach>
    </table>
    <c:if test="${currentPage > 0}">
        <a href="${pageContext.request.contextPath}/restaurants?page=${currentPage - 1}">Previous</a>
    </c:if>
    <c:if test="${restaurants.size() == size}">
        <a href="${pageContext.request.contextPath}/restaurants?page=${currentPage + 1}">Next</a>
    </c:if>
</body>
</html>
