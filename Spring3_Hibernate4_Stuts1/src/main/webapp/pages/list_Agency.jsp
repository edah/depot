<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html>
<head>
</head>
<body>
<h1>Gestion des Agencys</h1>
 
<h2>Liste des Agencys</h2>
 
<table border="1">
<tr><td>Agency Name</td></tr>
 
<logic:iterate id="Agency" name="dynaAgencyListForm" property="AgencyList">
<tr>	
<td><bean:write name="Agency" property="name"/></td>
</tr>
</logic:iterate> 
 
</table>
 
<br/>
<br/>
 <html:link action="/AddAgencyPage.do">Ajouter un Agency</html:link> 
 
</body>
</html>