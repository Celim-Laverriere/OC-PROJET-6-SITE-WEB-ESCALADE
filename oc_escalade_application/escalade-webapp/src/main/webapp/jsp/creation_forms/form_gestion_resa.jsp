<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 08/03/2019
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

</head>
<body>
<section>
    <%@include file="../_include/user_menu.jsp"%>

    <div class="container" style="border-style: solid; border-color: #DCDCDC; border-width: 2px; border-radius: 10px;
        margin-top: 1%; box-shadow: 6px 6px 14px #DCDCDC">

        <div class="row">
            <div class="col-md-12" style="text-align: center; margin-top: 1%">
                <h2>Gestion des réservations</h2>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12">
                <hr width="80%" color="#DCDCDC">
            </div>
        </div>

        <div class="row justify-content-center">
            <div class="col-md-9" style="border-style: solid; border-color: #DCDCDC; border-width: 2px; border-radius: 10px;
                 margin-top: 1%; margin-top: 1%">

                <h4 style="text-align: center">Demande de réservations</h4>

                <%--<div class="row">--%>
                <%--<div class="col-md-12">--%>
                <%--<hr width="80%" color="#DCDCDC">--%>
                <%--</div>--%>
                <%--</div>--%>

                <s:iterator value="applicantResaTopoList">

                <div class="alert alert-info" role="alert">
                    <div class="row align-items-center">
                        <div class="col-md-8">
                            <p>
                                <c:forEach var="compte" items="${applicantListAccount}">
                                    <c:if test="${compte.id == compte_id}">
                                        Nom du l'emprunteur : <c:out value="${compte.nom}"/>
                                        <c:out value="${compte.prenom}"/>
                                    </c:if>
                                </c:forEach>
                            </p>
                            <s:iterator value="topoList">
                                <p>Nom du topo : <s:property value="nom"/></p>
                            </s:iterator>
                            <p>Date de début <s:property value="date_debut"/> / Date de fin : <s:property value="date_fin"/></p>
                        </div>
                        <s:a action="message_resa_topo" class="btn btn-success" role="button">
                            Voir le(s) message(s)
                        </s:a>
                    </div>
                </div>
            </div>
            </s:iterator>

        </div>


        <div class="row justify-content-center">
            <div class="col-md-9" style="border-style: solid; border-color: #DCDCDC; border-width: 2px; border-radius: 10px;
                 margin-top: 1%; margin-top: 1%; margin-top: 1%">

                <h4 style="text-align: center">Mes demandes de réservations</h4>

                <%--<div class="row">--%>
                <%--<div class="col-md-12">--%>
                <%--<hr width="80%" color="#DCDCDC">--%>
                <%--</div>--%>
                <%--</div>--%>

                <s:iterator value="myResaTopoListRequests">

                <div class="alert alert-info" role="alert">
                    <div class="row align-items-center">
                        <div class="col-md-8">
                            <p>
                                <c:forEach var="compte" items="${ownerListAccount}">
                                    <c:if test="${proprietaire_topo == compte.id}">
                                        Nom du propriètaire : <c:out value="${compte.nom}"/>
                                        <c:out value="${compte.prenom}"/>
                                    </c:if>
                                </c:forEach>
                            </p>
                            <s:iterator value="topoList">
                            <p>Nom du topo : <s:property value="nom"/>
                                </s:iterator>
                            <p>Date de début   <s:property value="date_debut"/> / Date de fin : <s:property value="date_fin"/></p>
                        </div>
                        <div class="col-md-3">
                            <s:a  action="my_message_resa_topo" class="btn btn-success" role="button">
                                Voir le(s) message(s)
                            </s:a>
                        </div>
                    </div>
                    </s:iterator>
                </div>
            </div>
        </div>
    </div>
</section>

<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>

</body>
</html>
