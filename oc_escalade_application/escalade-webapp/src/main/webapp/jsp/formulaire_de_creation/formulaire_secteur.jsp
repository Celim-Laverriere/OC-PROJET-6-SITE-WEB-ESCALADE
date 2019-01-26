<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 07/11/2018
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>

<center><body>

    <header>
        <%@include file="../_include/formulaireChoixCreate.jsp"%>
    </header>

    <h1>Création d'un nouveau SECTEUR</h1>

    <div>
        <s:form action="new_secteur">

            <s:select name="site_id" label="Sélectionnez le site d'escalade"
                      list="sites" listKey="id" listValue="nom"
                      emptyOption="true" requiredLabel="true"/>

            <s:textfield name="secteur.nom" label="Nom du Secteur" requiredLabel="true"/>

            <s:textarea name="secteur.description" label="Description du secteur" cols="40" rows="5"/>

            <s:submit value="Validez"/>
        </s:form>
    </div>


</body></center>
</html>
