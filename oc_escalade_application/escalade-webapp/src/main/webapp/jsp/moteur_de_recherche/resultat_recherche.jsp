<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 23/10/2018
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>
<center><body>

    <header>
        <%@include file="../_include/header.jsp"%>
        <%@include file="../_include/moteurDeRecherche.jsp"%>
    </header>

    <h2>Liste des site d'éscalade de la région : <s:property value="regionSelect"/></h2>

    <ul>
        <s:iterator value="sites">
            <p>
                <s:a action="site_detail">
                    <s:param value="id" name="id"/>
                    Nom : <s:property value="nom"/></s:a><br/>
                <s:property value="description"/>
            </p>

        </s:iterator>

    </ul>

    <footer>

    </footer>
</body></center>
</html>
