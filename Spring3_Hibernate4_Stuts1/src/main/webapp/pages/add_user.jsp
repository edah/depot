<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion des utilisateurs</title>
</head>
<body>
<h1></h1>
 
<h2>Ajouter un utilisateur</h2>
<div style="color:red">
	<html:errors/>
</div>
 
<html:form action="/addUser.do">
 
<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="user.label.name" /> : 
	</div> 
 
	<html:text property="fullname" size="40" maxlength="20"/>
</div>
 
<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="user.label.login" /> : 
	</div> 
 	<html:text property="login" size="40" maxlength="20"/>
</div>
 
<div style="padding:16px">
	<div style="float:left;padding-right:8px;">
		<html:submit>
             <bean:message key="user.label.button.submit" />
        </html:submit>
	</div>
	<html:reset>
          <bean:message key="user.label.button.reset" />
     </html:reset>
</div>
 
</html:form>
 
</body>
</html>