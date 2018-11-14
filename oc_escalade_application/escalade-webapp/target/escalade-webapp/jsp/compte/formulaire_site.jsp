<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 27/10/2018
  Time: 11:36
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
        <%@include file="../_include/formulaireChoixCreate.jsp"%>
    </header>

    <h1>Création d'un nouveau SITE</h1>

    <div>
        <s:form action="new_site">

            <s:textfield name="site.nom" label="Nom du Site" requiredLabel="true"/>

            <s:select name="site.region" label="region"
                      list="regionList" listKey="region" listValue="region"
                      emptyOption="true"
                      requiredLabel="true"/>

            <s:textarea name="site.description" label="Description" cols="40" rows="5"/>

            <s:submit value="Validez"/>
        </s:form>
    </div>

</body></center>
</html>

