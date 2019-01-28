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

<body>

    <div>
        <%@include file="../_include/formulaireChoixCreate.jsp"%>
    </div>

    <div class="container" style=" position: absolute; top: 14%; left: 45%">
        <div class="row">
            <div class="col-md-9">
                 <h2>Création d'un nouveau SECTEUR</h2>

                    <s:form action="new_secteur">

                        <s:select name="site_id" label="Sélectionnez le site d'escalade"
                                  list="sites" listKey="id" listValue="nom"
                                  emptyOption="true" requiredLabel="true"/>

                        <s:textfield name="secteur.nom" label="Nom du Secteur" requiredLabel="true"/>

                        <s:textarea name="secteur.description" label="Description du secteur" cols="40" rows="5"/>

                        <s:submit value="Validez"/>
                    </s:form>

            </div>
        </div>
    </div>

</body>
</html>
