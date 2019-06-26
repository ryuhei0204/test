<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<!-- strutsを使わないver -->
<%
	request.setCharacterEncoding("utf-8");
	String userId = (String) request.getAttribute("userId");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン確認画面</title>
</head>
<body>
<table>
   <tr>
      <td><label>ユーザー名</label></td>
      <td><s:property value = "userId"/></td>
   </tr>
   <tr>
      <td><label>struts無しユーザー名</label></td>
      <td><p><%= userId %></p></td>
   </tr>
   <tr>
      <td><label>パスワード</label></td>
      <td><s:property value = "password"/></td>
   </tr>

</table>
</body>
</html>