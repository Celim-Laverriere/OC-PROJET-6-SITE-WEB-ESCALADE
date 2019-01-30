<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 05/10/2018
  Time: 11:15
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

<div class="container">

    <div class="row">
        <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
            <h4>Détail du site</h4>
            <hr width="100%" color="#DCDCDC">
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="well well-md">
                <h4>Nom du site : <s:property value="site.nom"/></h4>
                <p>Région : <s:property value="site.region"/></p>
                <p>Description : <s:property value="site.description"/></p>
            </div>
        </div>
    </div>
    <hr width="100%" color="#DCDCDC">

    <div class="row">
        <div class="col-md-12">
            <h4>Commentaires</h4>
        </div>
    </div>

    <s:iterator value="site.commentaires">
        <div class="row">
            <div class="col-md-12">
                <div class="well well-md">
                    <li><s:property value="commentaire"/></li>
                </div>
            </div>
        </div>
    </s:iterator>
    <hr width="100%" color="#DCDCDC">

    <div class="row">
        <div class="col-md-12">
            <h4>Secteurs & Voies</h4>
        </div>
    </div>

    <s:iterator value="site.secteurs">
        <div class="row">
            <div class="col-md-12">
                <div class="well well-md">
                    <h6>Nom du secteur : <s:property value="nom"/></h6>
                    <p>Description : <s:property value="description"/></p>
                </div>
            </div>
        </div>

        <s:iterator value="voies">
            <div class="row">
                <div class="col-md-8">
                    <div class="well well-md">
                        <li>Nom de la voie : <s:property value="nom"/></li>
                    </div>
                </div>

                <div class="col-md-4">
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

<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>

</body>
</html>
