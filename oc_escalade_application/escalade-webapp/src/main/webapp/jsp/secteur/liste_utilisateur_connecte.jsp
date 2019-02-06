<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 02/02/2019
  Time: 15:30
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
<s:property value="%{sites.nom}"></s:property>
<s:iterator value="sites">
    <h6><s:property value="%{sites.nom}"></s:property> </h6>
<%--<s:if test="%{sites.id.equals(secteurs.site_id)}">--%>

        <h6><s:property value="sites.nom"></s:property> </h6>

<%--</s:if>--%>
</s:iterator>
<div class="container" style=" position: absolute; top: 14%; left: 35%">
    <div class="row">
        <div class="col-md-6" style="margin-left: 10%; margin-top: 10px; margin-bottom: 10px; text-align: center">
            <h2>Mes Secteurs </h2>
        </div>
    </div>

    <div class="row">
        <div class="col-md-9">
            <hr width="95%" color="#DCDCDC">
        </div>
    </div>
    
    <s:iterator value="secteurs">
        <div class="row">
            <div class="col-md-8" style="margin-top: 5px">
                <ul>
                    <div class="well well-md">
                        <p>ID SITE : <s:property value="id"/></p>
                        <h4>Nom du site : <s:property value="nom"/></h4>
                        <p>Dscription : <s:property value="description"/></p>
                    </div>
                </ul>
            </div>
        </div>

        <div class="row">
            <div class="col-md-5"></div>
            <div class="col-md-2">
                <s:a  action="" class="btn btn-info" role="button">
                    <s:param name="site_id" value="id"/>
                    Modifier
                </s:a>
            </div>
            <div>
                <s:a action="" class="btn btn-danger"
                     onclick="javascript:return confirm('Confirmez la suppression du site!');" type="button">
                    <s:param name="site_id" value="id"/>
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

</div>

<script>
    <%@include file="../_include/footer.jsp"%>
</script>

</body>
</html>
