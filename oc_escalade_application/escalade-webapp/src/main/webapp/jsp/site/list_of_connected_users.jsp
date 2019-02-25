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

<%@include file="../_include/user_menu.jsp"%>

<div class="container" style="margin-top: 1%; border-style: solid; border-color: #DCDCDC; border-width: 2px;
     border-radius: 10px; box-shadow: 6px 6px 14px #DCDCDC">
    <div class="row">
        <div class="col-md-12" style="text-align: center; margin-top: 1%">
            <h2>Mes sites d'éscalades</h2>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <hr width="80%" color="#DCDCDC">
        </div>
    </div>

    <s:iterator value="sites">
        <div class="row justify-content-center">
            <div class="col-md-9" style="margin-top: 1%">
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

        <div class="row justify-content-end">
            <div class="col-md-4">
                <s:a action="modifier_site">
                    <s:param name="site_id" value="id"/>
                    <button type="button" class="btn btn-outline-primary">Modifier</button>
                </s:a>

                <s:a action="supprimer_site" onclick="javascript:return confirm('Confirmez la suppression du site!');">
                    <s:param name="site_id" value="id"/>
                    <button type="button" class="btn btn-outline-danger">Supprimer</button>
                </s:a>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12">
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
