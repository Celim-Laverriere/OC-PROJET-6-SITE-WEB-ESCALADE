<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 12/11/2018
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>
<center><body>
<%@include file="/jsp/_include/header.jsp"%>

    <h2>Connexion</h2>

    <s:form action="login">
        <s:textfield name="login" label="Identifiant" requiredLabel="true"/>
        <s:password name="password" label="Mot de passe" requiredLabel="true"/>

        <s:submit value="Connexion"/>
    </s:form>

</body></center>
</html>
