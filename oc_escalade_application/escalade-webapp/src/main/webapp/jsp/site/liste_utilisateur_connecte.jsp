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

<header>
    <%@include file="../_include/header.jsp"%>
</header>

<div class="container">

    <div class="row">
        <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
            <h2>Mes sites d'éscalades</h2>
            <hr width="100%" color="#DCDCDC">
        </div>
    </div>

    <s:iterator value="sites">
        <div class="row">
            <div class="col-md-9" style="margin-top: 5px">
                <ul>
                    <div class="well well-md">
                        <h4>Nom du site : <s:property value="nom"/></h4>
                        <h4>Région : <s:property value="region"/></h4>
                        <p>Dscription : <s:property value="description"/></p>
                    </div>
                </ul>
            </div>
        </div>

        <div class="row">
            <div class="col-md-10"></div>
            <div class="col-md-2">
                <s:a  action="site_detail" class="btn btn-outline-info" role="button">
                    <s:param value="id" name="site_id"/>
                    Modifier
                </s:a>
            </div>
        </div>
        <hr width="100%" color="#DCDCDC">
    </s:iterator>

    <s:actionerror />
</div>

<script>
    <%@include file="../_include/footer.jsp"%>
</script>

</body>
</html>
