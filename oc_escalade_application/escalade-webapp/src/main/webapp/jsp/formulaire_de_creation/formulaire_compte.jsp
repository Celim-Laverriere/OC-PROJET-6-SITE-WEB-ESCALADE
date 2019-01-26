<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 26/11/2018
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <%@include file="../_include/head.jsp"%>
    <%@include file="../_include/header.jsp"%>
</head>
    <center>
        <body>

        <h2> Creez votre compte OC Escalade</h2>
        <div class="container">
            <s:form action="creerCompte">
                <s:textfield name="compte.nom" label="Nom" required="true" requiredLabel="true"/>
                <s:textfield name="compte.prenom" label="Prenom" required="true" requiredLabel="true"/>
                <s:textfield name="compte.mail" label="E-mail" required="true" requiredLabel="true"/>
                <s:password name="compte.mot_de_passe" label="Mote de passe" required="true" requiredLabel="true"/>
                <s:submit value="Validez"/>
            </s:form>
        </div>

        </body>
    </center>
</html>
