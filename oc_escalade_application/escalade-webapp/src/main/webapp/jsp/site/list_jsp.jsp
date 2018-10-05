<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 05/10/2018
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Site d'escalades</title>
</head>

<body>

    <h2>Liste des sites d'éscalades</h2>

    <ul>
        <s:iterator value="sites">
            <li>
                <s:a action="site_detail">
                    <s:param value="id" name="id"/>
                    <s:property value="nom"/>
                </s:a>

                - Secteurs :
                <s:a action="secteur_list">
                    <s:param name="id" value="secteur.id"/>
                    <s:property value="secteur.nom" />
                </s:a>
            </li>
        </s:iterator>
    </ul>
</body>
</html>
