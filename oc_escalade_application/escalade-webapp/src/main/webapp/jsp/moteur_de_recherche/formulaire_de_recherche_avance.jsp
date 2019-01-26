<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 08/11/2018
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>
<center><body>

    <header>
        <%@include file="../_include/header.jsp"%>
    </header>

    <h1>Formulaire de recherche !</h1>

    <div>
        <s:form action="recherche_avancer">

                <s:select name="regionSelect" label="region"
                          list="regionList" listKey="region" listValue="region"
                          emptyOption="true"
                          requiredLabel="true"/>

                <s:select name="typeVoieSelect" label="Choix le type de voies désiré (Equipé ou non équipée)"
                          list="typeVoie" emptyOption="true" requiredLabel="true"/>

                <s:select name="cotationVoieSelect" label="Choix de la dificulté de(s) voie(s) désireé(s)"
                          list="cotationVoieList" emptyOption="true" requiredLabel="true"/>

                <s:submit value="Validez" />

        </s:form>
    </div>

</body></center>
</html>
