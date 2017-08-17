<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Countries, Languages, Cities!!!</h1>
	<p>${countries }</p>

	<div>
		<ul>
		 	<li>Number of Cities in Country</li>
			<li>Name of the Country</li>
			<li>Cities</li>
		</ul>
		
		<%-- <ul>
			<c:forEach var="country" items="${countries }">
				<li>${country.name }  ${country.cities.size() }</li>
			</c:forEach>
		</ul> --%>
		
	<%-- 	<ul>
			<c:forEach var="city" items="${cities }">
				<li>${city.name }</li>
				<li>${city.population }</li>
			</c:forEach>
		</ul> --%>
		
		<%-- <ul>
			<c:forEach var="language" items="${languages }">
				<li>${language.language }</li>
				<li></li>
			</c:forEach>
		</ul> --%>
		
		 <%-- <ul>
			<c:forEach var="country" items="${countries }">
				<li>${country.name }</li>
				<li>${country.surface_area }</li>
			</c:forEach>
		</ul> --%>
		
		<ul>
			<c:forEach var="city" items="${cities }">
				<li>${city.name }</li>
				<li>${city.country.name }</li>
				<li>${city.district }</li>
				<li>${city.country.population }</li>
			</c:forEach>
		</ul>

	
		
		
		
		
		
		

	</div>

</body>
</html>