<%@ page import="org.escalade.model.bean.Site" %><%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 31/01/2019
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

<div class="container" style="position: absolute; top: 14%; left: 29%">
    <div class="row justify-content-md-center">
        <div class="col-md-6">
            <h4>Modifier un site</h4>

            <div class="form-group" class="form-horizontal">
                <s:form action="modifier_site" class="form-horizontal">

                    <s:textfield type="HIDDEN" value="%{site.id}" name="modifSite.id"/>


                    <s:textfield name="modifSite.nom" label="Nom du Site" labelposition="top"
                                 value="%{site.nom}" class="form-control" style="width: 150%"/>

                    <s:select name="modifSite.region" label="region" labelposition="top"
                              list="regionList" listKey="region" listValue="region" value="%{site.region}"
                              emptyOption="true" class="form-control" style="width: 150%"/>

                    <s:textarea name="modifSite.description" label="Description" labelposition="top"
                                cols="40" rows="5" value="%{site.description}" class="form-control" style="width: 150%"/>

                    <s:submit cssClass = "btn btn-primary" value="Validez" style="position: absolute; left: 3%"/>

                </s:form>
            </div>
        </div>
    </div>
</div>

<script>
    <%@include file="../_include/footer.jsp"%>
</script>

</body>
</html>
