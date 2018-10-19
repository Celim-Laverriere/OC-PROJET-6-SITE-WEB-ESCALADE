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
    <%@include file="../_include/head.jsp"%>
</head>

<center><body>

    <header>
        <%@include file="/jsp/_include/header.jsp"%>
    </header>

        <h2>Liste des sites d'éscalades</h2>

        <ul>
            <s:iterator value="sites">
                <p>
                   <s:a action="site_detail">
                        <s:param value="id" name="id"/>
                        Nom : <s:property value="nom"/></s:a><br/>
                </p>
            </s:iterator>
        </ul>
</body></center>
</html>
