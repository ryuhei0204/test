<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新規登録画面</title>
</head>
<body>
<script src = "./js/button.js"></script>
<h1>新規登録画面</h1>
<s:if test = "!(createError.isEmpty()) && createError != null">
  <s:property value = "createError"/>
</s:if>
<form>
  <table>
     <tr>
        <th>姓</th>
        <td><input type = "text" name = "sei" placeholder = "姓" value = "<s:property value = "sei"/>"/></td>
     </tr>

     <tr>
        <th>名</th>
        <td><input type = "text" name = "mei" placeholder = "名" value = "<s:property value = "mei"/>"/></td>
     </tr>

     <tr>
        <th>姓ふりがな</th>
        <td><input type = "text" name = "seikana" placeholder = "ふりがな" value = "<s:property value = "seikana"/>"/></td>
     </tr>

     <tr>
        <th>名ふりがな</th>
        <td><input type = "text" name = "meikana" placeholder = "ふりがな" value = "<s:property value = "meikana"/>"/></td>
     </tr>

    <tr>
		<th><label>性別</label></th>
			<td>
				<label><input type="radio" name = "seibetu" value = "0"<s:if test = 'seibetu == 0'> checked</s:if>>男性</label>
				<label><input type="radio" name = "seibetu" value = "1"<s:if test = 'seibetu == 1'> checked</s:if>>女性</label>
			</td>
	</tr>

     <tr>
        <th>メールアドレス</th>
        <td><input type = "text" name = "mail" placeholder = "メールアドレス" value = "<s:property value = "mail"/>"/></td>
     </tr>

     <tr>
        <th>ユーザー名</th>
        <td><input type = "text" name = "userName" placeholder = "ユーザー名" value = "<s:property value = "userName"/>"/></td>
     </tr>

     <tr>
        <th>ユーザーID</th>
        <td><input type = "text" name = "userId" placeholder = "ユーザーID" value = "<s:property value = "userId"/>"/></td>
     </tr>

     <tr>
        <th>パスワード</th>
        <td><input type = "password" name = "password" value = ""/></td>
     </tr>
 </table>

       <input type = "button" onclick = "formSubmit(this,CreateConfirmAction)" value = "確認"/><br>
       <a href = '<s:url action = "LoginAction"/>'>ログイン</a><label>はこちら</label>



</form>
</body>
</html>