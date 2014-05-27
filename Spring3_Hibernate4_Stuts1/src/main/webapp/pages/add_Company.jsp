<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Annuaire LDAP</title>
</head>
<body>
<h1></h1>
 
<h2>Ajouter un Company</h2>
<div style="color:red">
	<html:errors/>
</div>

<html:form action="/addCompany.do">
 
<div style="padding:16px">
	<div style="float:left;width:100px;">
		<bean:message key="company.label.name" /> : 
	</div> 
 
	<html:text property="name" size="40" maxlength="20"/>
</div>

<div style="padding:16px">
	<div style="float:left;padding-right:8px;">
		<html:submit>
             <bean:message key="company.label.button.submit" />
        </html:submit>
	</div>
	<html:reset>
          <bean:message key="company.label.button.reset" />
     </html:reset>
</div>
 
</html:form>
 
</body>
</html>