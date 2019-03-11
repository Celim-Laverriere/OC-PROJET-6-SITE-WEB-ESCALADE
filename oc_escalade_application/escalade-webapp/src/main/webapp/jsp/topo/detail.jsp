<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 16/10/2018
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <s:if test="!#session.user">
        <%@include file="../_include/head.jsp"%>
    </s:if>
</head>

<body>
<section>
    <s:if test="!#session.user">
        <%@include file="../_include/header.jsp"%>
    </s:if>
    <s:else>
        <%@include file="../_include/user_menu.jsp"%>
    </s:else>

    <div class="container" style="margin-top: 1%; border-style: solid; border-color: #DCDCDC; border-width: 2px;
border-radius: 10px; box-shadow: 6px 6px 14px #DCDCDC">

        <s:iterator value="topo">

        <div class="row">
            <div class="col-md-12" style="margin-top: 10px; margin-bottom: 10px; text-align: center">
                <h2>Detail du topos d'éscalades : <s:property value="nom"/></h2>
                <hr width="90%" color="#DCDCDC">
            </div>
        </div>

        <div class="row justify-content-center">

            <c:forEach var="photo" items="${photoList}">
                <c:if test="${id == photo.topo_id}">
                    <img src="<c:out value="${photo.url_image}"/>" style="width: 400px; height: 400px"
                         alt="<c:out value="${photo.nom}"/>" class="rounded float-left">
                </c:if>
            </c:forEach>

            <div class="col-md-10" style="margin-top: 1%">

                <p>Date d'upload : <s:property value="date_upload"/></p>
                <p>Desciption : <s:property value="description"/></p>
            </div>
        </div>


        <div class="row">
            <div class="col-md-12">
                <hr width="90%" color="#DCDCDC">
            </div>
        </div>

        <div class="row">
            <div class="col-md-12">
                <h3 style="text-align: center">Reservation topo</h3>
                <hr width="80%" color="#DCDCDC">

                <s:if test="%{statut == 'libre'}">
                    <p style="text-align: center">Ce topo est libre ! Pour le réserver cliquez sur "Demande de réservation", et remplissez le formulaire !</p>
                </s:if>
                <s:else>
                    <p style="text-align: center">Désolé ce topo n'est pas disponible pour le moment !</p>
                </s:else>
            </div>
        </div>

        <div class="row justify-content-center">

            <div class="col-md-3">
                <s:a action="topo_list">
                    <button type="button" class="btn btn-outline-primary" style="width: 100%">Retour</button>
                </s:a>
            </div>
            <s:if test="%{statut == 'libre' && compte_id != #session.user.id}">
                <div class="col-md-3">
                    <s:a action="resa_topo">
                        <s:param name="topo_id" value="id"/>
                        <button type="button" class="btn btn-outline-primary" style="width: 100%">Demmande de réservation</button>
                    </s:a>
                </div>
            </s:if>
        </div>
        </s:iterator>

        <div class="row">
            <div class="col-md-12">
                <hr width="80%" color="#DCDCDC">
            </div>
        </div>

</section>

<section>
    <div class="container" style="margin-top: 1%; border-style: solid; border-color: #DCDCDC; border-width: 2px;
border-radius: 10px; box-shadow: 6px 6px 14px #DCDCDC">

        <div class="row">
            <div class="col-md-12">
                <h4 style="text-align: center">Commentaires</h4>
                <hr width="80%" color="#DCDCDC">
            </div>
        </div>

        <s:iterator value="topo">
            <div class="row justify-content-center">
                <div class="col-md-10">

                    <s:if test="%{topo.commentaires.isEmpty()}">
                        <p>Ce topo d'éscalade n'a pas encore de commentaires !</p>
                    </s:if>
                    <s:else>
                        <s:iterator value="commentaires">
                            <c:forEach var="compte" items="${applicantListAccount}">
                                <c:if test="${compte.id == compte_id}">
                                    <p>Commentaire poster par : <c:out value="${compte.nom}"/></p>
                                </c:if>
                            </c:forEach>
                            <p><s:property value="commentaire"/></p>
                        </s:iterator>
                    </s:else>

                </div>
            </div>
        </s:iterator>
    </div>

    </div>
</section>

<footer>
    <%@include file="../_include/footer.jsp"%>
    <s:if test="!#session.user">
        <%@include file="../_include/scripts.jsp"%>
    </s:if>
</footer>

</body>
</html>
