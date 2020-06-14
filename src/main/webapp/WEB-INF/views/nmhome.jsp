<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<c:forEach var="mynmlogin" items="${nmlogin}">
<ul>

 <li>
 고객님 환영합니다.
 회원님의 전화번호는 ${mynmlogin.nonmem_tel} 입니다.<br>
 
 </li>
 <li>
  <a href="nmmyPage.do?nonmem_tel=${mynmlogin.nonmem_tel}">마이페이지</a>
 </li>
 <li>
  <a href="logout.do">로그아웃</a>
 </li>

 
 </ul>
 
</c:forEach>
</body>
</html>
