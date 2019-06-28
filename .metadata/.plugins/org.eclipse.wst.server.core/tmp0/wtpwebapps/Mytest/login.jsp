<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN画面</title>
</head>
<body>
<h1>LOGIN</h1>
<s:if test = "!(errorMessage.isEmpty()) && errorMessage != null">
   <s:property value = "errorMessage" escape="false"/>
</s:if>
<form action = "LoginConfirmAction" method = "post">
<table>
   <tr>
      <td><input type = "text" name = "mixuser" value = "<s:property value = 'mixuser'/>" placeholder = "ユーザーID又はユーザー名"/></td>
   </tr>
   <tr>
      <td><input type = "password" name = "password" value = "" placeholder = "パスワード"/></td>
   </tr>
   <tr>
      <td><input type = "submit" value = "確認"/></td>
   </tr>
   <tr>
      <td><a href = '<s:url action = "GoHomeAction" />'>HOME</a></td>
   </tr>
</table>
</form>
<!-- formの中に入れると利かないので注意！ -->
<a href = '<s:url action = "GoHomeAction" />'><input type = "button" value = "HOME"/></a>
</body>
</html>