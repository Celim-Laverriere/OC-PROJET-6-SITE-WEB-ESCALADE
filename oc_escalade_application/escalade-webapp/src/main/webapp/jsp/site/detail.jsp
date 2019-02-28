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

<section>
<div class="container">

    <div class="row">
        <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
            <h4>Détail du site : <s:property value="site.nom"/></h4>
            <hr width="100%" color="#DCDCDC">
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="well well-md">
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

    <s:if test="%{site.commentaires.isEmpty()}">
        <p>Ce site n'a pas encore de commentaires !</p>
    </s:if>
    <s:else>
        <s:iterator value="site.commentaires">
            <div class="row">
                <div class="col-md-12">
                    <div class="well well-md">
                        <p><s:property value="commentaire"/></p>

                    </div>
                </div>
            </div>
        </s:iterator>
    </s:else>
    <hr width="100%" color="#DCDCDC">

    <div class="row">
        <div class="col-md-12">
            <h4>Secteurs</h4>
        </div>
    </div>

    <s:iterator value="site.listSecteurs">
        <div class="row">
            <div class="col-md-10">
                <div class="well well-md">
                    <h6>Nom du secteur : <s:property value="nom"/></h6>
                    <p>Description : <s:property value="description"/></p>
                </div>
            </div>
            <div class="col-md-5 offset-md-9">
                <s:a action="secteur_detail" class="btn btn-outline-info" role="button">
                    <s:param value="id" name="secteur.id"/>
                    Détail du secteur
                </s:a>
            </div>
        </div>
        <hr width="100%" color="#DCDCDC">
    </s:iterator>
</div>
</section>

<footer>
    <%@include file="../_include/footer.jsp"%>
    <%@include file="../_include/scripts.jsp"%>
</footer>

</body>
</html>
