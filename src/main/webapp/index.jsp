<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.min.js" ></script>
<script type="text/javascript">
$(document).ready(function(){
	console.log("여기");
	location.href="shoesfactory_home.do";
});
</script>
</head>
<body>
<%-- <%
	session.setAttribute("username", "홍길동");
	session.setAttribute("usernum", "010-4444-4444");
	
%>
<form action="cart/AddCart.do" method="post">
	<table border=2>
		<tr>
			<td>상품명</td>
			<td><input type="text" name="cart_product_name"></td>
		</tr>
		<tr>
			<td>수량</td>
			<td><input type="text" name="cart_product_amount"></td>
		</tr>
		<tr>
			<td>사이즈</td>
			<td><input type="text" name="cart_product_size"></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><input type="text" name="cart_product_price"></td>
			<input type="hidden" name="cart_usernum" value="${usernum }">
		</tr>
		<tr>
			<td><input type="submit" value="전송"></td>
		</tr>
		<tr>
			<td><a href="admin/prodall.do">[제품]</a>
				<a href="admin/stocklist.do">[재고]</a></td>
		</tr>
	</table> --%>
</form>
</body>
</html>