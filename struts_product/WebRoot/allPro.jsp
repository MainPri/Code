<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
		<table>
			<tr>
				<td>ProId</td>
				<td>ProName</td>
				<td>ProPric</td>
				<td>Operation</td>
			</tr>
			<c:forEach items="${infos}" var="info">
				<tr>
					<td>${info.productId}</td>
					<td>${info.productName}</td>
					<td>${info.qty}</td>
					<td><a href="del_Pro?ProductId=${info.productId}">删除</a></td>
					<td><a href="${pageContext.request.contextPath}/addPro.jsp">添加</a></td>
					<td><a href="sel_Pro?ProductId=${info.productId}">修改</a></td>
				</tr> 
			</c:forEach>
		</table>
  </body>
</html>
