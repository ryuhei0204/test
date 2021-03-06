<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta  http-equiv="Content-Style-Type" content="text/css"/>
<meta  http-equiv="Content-Script-Type" content="text/javascript"/>
<meta  http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>ユーザー情報登録画面</title>

<!-- css -->

</head>
<body>
<div>
  <s:if test="errorMessage !=''">
    <s:property value="errorMessage" escape="false"/>
  </s:if>
  <table>

  <s:form action = "CreateUserConfirmAction">

    <tr>
      <td>
        <label>姓</label>
      </td>
      <td>
        <input type = "text" pattern = "^[a-zA-Z0-9ぁ-ん\u4E00-\u9FFF]{1,16}$" name = "sei" value = ""/>
      </td>
      <td>
        <label>名</label>
      </td>
      <td>
        <input type = "text" name = "mei" pattern = "^[a-zA-Z0-9ぁ-ん\u4E00-\u9FFF]{1,16}$" value = ""/>
      </td>
    </tr>

    <tr>
      <td>
        <label>姓ふりがな</label>
      </td>
      <td>
        <input type = "text" name = "seikana" pattern = "^[ぁ-ん]{1,16}$" value = ""/>
      </td>
      <td>
        <label>名ふりがな</label>
      </td>
      <td>
        <input type = "text" name = "meikana" pattern = "^[ぁ-ん]{1,16}&" value = ""/>
      </td>
    </tr>

    <tr>
      <td>
        <input type="radio" name = "seibetu" value = "man">男
        <input type="radio" name = "seibetu" value = "woman">女
      </td>
    </tr>

    <tr>
      <td>
        <label>メールアドレス</label>
      </td>
      <td>
        <input type = "text" name = "mail" pattern = "^([a-z0-9])+([a-z0-9\._-])*@([a-z0-9_-])+([a-z0-9\._-]+)+$" value = ""/>
      </td>
    </tr>

    <tr>
      <td>
        <label>ユーザーID</label>
      </td>
      <td>
        <input type = "text" name = "userId" pattern = "^[a-z0-9]{1,8}$" value = ""/>
      </td>
    </tr>

    <tr>
      <td>
        <label>パスワード</label>
      </td>
      <td>
        <input type = "text" name = "password" pattern = "^[a-z0-9]{1,16}$" value = ""/>
      </td>
    </tr>
    <s:submit value = "登録"/>
    </s:form>
  </table>
</div>
</body>
</html>