<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html>
<head>
</head>
<body>
<h1>Gestion des utilisateurs</h1>
 
<h2>Liste des utilisateurs</h2>
 
<table border="1">
<tr><td>User Name</td><td>Login</td></tr>
 
<logic:iterate id="user" name="dynaUserListForm" property="userList">
<tr>	
<td><bean:write name="user" property="fullname"/></td>
<td><bean:write name="user" property="login"/></td>
</tr>
</logic:iterate> 
 
</table>
 
<br/>
<br/>
<html:link action="/AddUserPage.do">Ajouter un utilisateur</html:link>
 
</body>
</html>