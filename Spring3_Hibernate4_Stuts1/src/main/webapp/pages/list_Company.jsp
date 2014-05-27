<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html>
<head>
</head>
<body>
<h1>Gestion des Companys</h1>
 
<h2>Liste des Companys</h2>
 
<table border="1">
<tr><td>Company Name</td></tr>
 
<logic:iterate id="Company" name="dynaCompanyListForm" property="CompanyList">
<tr>	
<td><bean:write name="Company" property="name"/></td>
</tr>
</logic:iterate> 
 
</table>
 
<br/>
<br/>
 <html:link action="/AddCompanyPage.do">Ajouter un company</html:link> 
 
</body>
</html>