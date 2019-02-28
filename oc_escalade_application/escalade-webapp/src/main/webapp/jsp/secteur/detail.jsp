<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 05/02/2019
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>

<body>

<header>
    <%@include file="../_include/header.jsp"%>
</header>

<section>
<div class="container">
    <s:iterator value="secteur">
    <div class="row">
        <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
            <h4>Détail du secteur : <s:property value="nom"/></h4>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
            <p>Description : <s:property value="description"/></p>
        </div>
    </div>

        <hr width="100%" color="#DCDCDC">

        <div class="row">
            <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
                <h4>Voie(s) d'éscalade(s)</h4>
            </div>
        </div>

        <s:iterator value="listVoies">
            <div class="row">
                <div class="col-md-8">
                    <div class="well well-md">
                        <h6><s:property value="nom"/></h6>
                        <p><s:property value="description"/> </p>
                    </div>
                </div>

                <div class="col-md-4 offset-md-9">
                    <s:a action="voie_detail" class="btn btn-outline-info" role="button">
                        <s:param value="id" name="voie_id"/>
                        Détail de la voie
                    </s:a>
                </div>
            </div>

            <hr width="100%" color="#DCDCDC">
        </s:iterator>

    </s:iterator>
</div>
</section>

<footer>
    <%@include file="../_include/footer.jsp"%>
    <%@include file="../_include/scripts.jsp"%>
</footer>
</body>
</html>
