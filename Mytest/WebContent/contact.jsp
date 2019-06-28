<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
	<script src="js/button.js"></script>

	<h1>お問い合わせ</h1>
	<s:if test = "!(message.isEmpty()) && message != null">
  <s:property value = "message"/>
</s:if>

	<form action="ContactConfirmAction">

	<label>カテゴリー</label>
		<select>
			<option value="1">1ついて</option>
			<option value="2">2ついて</option>
			<option value="3">3ついて</option>
			<option value="4">4ついて</option>
			<option value="5">5ついて</option>
		</select>
		<table>

			<tr>
				<td><label>名前</label></td>
				<td><input type = "text" name = "contactname" placeholder = "名前" value = "<s:property value = '#session.contactname'/>"/></td>
			</tr>

			<tr>
				<td><label>メールアドレス</label>
				<td><input type = "text" name = "contactmail" placeholder = "メールアドレス" value = "<s:property value = '#session.contactmail'/>"/></td>
			</tr>

			<tr>
				<td><label>電話番号</label>
				<td><input type = "text" name = "contacttel" placeholder = "電話番号" value = "<s:property value = '#session.contacttel'/>"/></td>
			</tr>

			<tr>
				<td><label>タイトル</label></td>
				<td><input type = "text" name = "title" placeholder = "タイトル" value = "<s:property value = '#session.title'/>"/>
			</tr>

			<tr>
				<td><label>内容</label></td>
				<td><textarea  name = "contents"><s:property value = "#session.contents"/></textarea></td>
			</tr>

			<tr>
				<td><input type = "submit" value = "確認"/></td>
			</tr>

		</table>
	</form>
</body>
</html>