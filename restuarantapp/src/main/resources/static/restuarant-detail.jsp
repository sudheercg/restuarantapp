<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Restaurant Detail</title>
</head>
<body>
    <h1>Restaurant Detail</h1>
    <table border="1">
        <tr><th>ID</th><td>${restaurant.restaurantID}</td></tr>
        <tr><th>Name</th><td>${restaurant.restaurantName}</td></tr>
        <tr><th>City</th><td>${restaurant.city}</td></tr>
        <tr><th>Address</th><td>${restaurant.address}</td></tr>
        <!-- Add more fields as necessary -->
    </table>
    <a href="${pageContext.request.contextPath}/restaurants">Back to List</a>
</body>
</html>
