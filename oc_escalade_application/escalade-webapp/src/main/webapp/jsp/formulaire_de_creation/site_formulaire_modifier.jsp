<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 31/01/2019
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-12">
            <%@include file="../_include/formulaireChoixCreate.jsp"%>
        </div>
    </div>
</div>

<div class="container" style=" position: absolute; top: 14%; left: 40%">
    <div class="row">
        <div class="col-md-9">

            <div>
                <h2>Modification du site <s:property value="%{site.nom}"/></h2>

                <p>Nom du site actuel : <s:property value="%{site.nom}"/></p>
                <p>Nom de la région actuel du site : <s:property value="%{site.region}"/></p>
                <p>Description : <s:property value="%{site.description}"/></p>
            </div>

                <s:form action="modifier_site">

                    <s:textfield type="HIDDEN" value="%{site.id}" name="modifSite.id"/>
                    
                    <s:textfield name="modifSite.nom" label="Nom du Site" value="%{site.nom}"
                                 placeholder="Nouveau nom"/>

                    <s:select name="modifSite.region" label="region"
                              list="regionList" listKey="region" listValue="region" value="%{site.region}"
                              emptyOption="true"/>
                    
                    <s:textarea name="modifSite.description" label="Description"
                                cols="40" rows="5" value="%{site.description}"/>

                    <s:submit value="Validez"/>

                </s:form>

        </div>
    </div>
</div>

<script>
    <%@include file="../_include/footer.jsp"%>
</script>
</body>
</html>
