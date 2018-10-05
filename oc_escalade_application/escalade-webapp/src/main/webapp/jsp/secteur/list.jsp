<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 05/10/2018
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
    <title>Site d'escalades</title>
</head>

<body>
    <h2>Détail du secteur</h2>

    <ul>
        <li>ID : <s:property value="secteur.id"/></li>
        <li>Nom : <s:property value="secteur.nom"/></li>
        <li>Description : <s:property value="secteur.description"/></li>
    </ul>

</body>

</html>
