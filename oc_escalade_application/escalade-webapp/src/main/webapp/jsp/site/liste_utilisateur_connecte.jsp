<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 30/01/2019
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
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

<div class="container" style=" position: absolute; top: 14%; left: 35%">
    <div class="row">
        <div class="col-md-6" style="margin-left: 10%; margin-top: 10px; margin-bottom: 10px; text-align: center">
            <h2>Mes sites d'éscalades</h2>
        </div>
    </div>

    <div class="row">
        <div class="col-md-9">
            <hr width="95%" color="#DCDCDC">
        </div>
    </div>

    <s:iterator value="sites">
        <div class="row">
            <div class="col-md-8" style="margin-top: 5px">
                <ul>
                    <div class="well well-md">
                        <p>ID SITE : <s:property value="id"/></p>
                        <h4>Nom du site : <s:property value="nom"/></h4>
                        <h4>Région : <s:property value="region"/></h4>
                        <p>Dscription : <s:property value="description"/></p>
                    </div>
                </ul>
            </div>
        </div>

        <div class="row">
            <div class="col-md-5"></div>
            <div class="col-md-2">
                <s:a  action="modifier_site" class="btn btn-outline-info" role="button">
                    <s:param name="site_id" value="id"/>
                    Modifier
                </s:a>
            </div>
            <div>
                <s:a action="" class="btn btn-outline-info" role="button">
                    Supprimer
                </s:a>
            </div>
        </div>

        <div class="row">
            <div class="col-md-9">
                <hr width="95%" color="#DCDCDC">
            </div>
        </div>

    </s:iterator>

    <s:actionerror />

</div>

<script>
    <%@include file="../_include/footer.jsp"%>
</script>

</body>
</html>
