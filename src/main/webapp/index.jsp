<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<% request.setAttribute("foo", "foo-value"); %>
	<h2>Hello World! <c:out value="${foo}" default="guest" /></h2>
	<a href="hello">please click me!</a>
</body>
</html>
