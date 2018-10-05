<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 05/10/2018
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Site d'escalades</title>
</head>

<body>
    <h2>Détail du site</h2>

    <ul>
        <li>ID : <s:property value="site.id"/> </li>
        <li>Nom : <s:property value="site.nom"/> </li>
        <li>Region : <s:property value="site.region"/> </li>
        <li>Description : <s:property value="site.description"/> </li>
        <li>
            Secteur :
            <s:a action="secteur_list">
                <s:param name="id" value="site.secteur.id"/>
                <s:property value="site.secteur.nom"/>
                <s:property value="site.secteur.id"/>
            </s:a>
        </li>


    </ul>
</body>

</html>
