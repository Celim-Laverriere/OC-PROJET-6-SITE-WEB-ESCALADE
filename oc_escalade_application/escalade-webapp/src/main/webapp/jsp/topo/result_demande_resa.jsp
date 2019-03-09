<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 08/03/2019
  Time: 11:46
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

    <div class="container" style="margin-top: 1%; border-style: solid; border-color: #DCDCDC; border-width: 2px;
     border-radius: 10px; box-shadow: 6px 6px 14px #DCDCDC">

        <div class="row">
            <div class="col-md-9" style="text-align: center; margin-top: 1%">
                <h2>Confirmation de la réservation du topo <s:property value="#topo.nom"/></h2>
            </div>
        </div>

        <div class="row">
            <div class="col-md-9">
                <hr width="80%" color="#DCDCDC">
            </div>
        </div>

        <div class="row">
            <div class="col-md-9" style="text-align: center; margin-top: 1%">
                <p>Votre réservation a bien été pris en compte et a été envoyer ce-jour au propriétaire du topo !</p>
                <p>Le temps de réponse et en moyenne de 24 heures !</p>
                <p>Vous pouvez consulter et gérer vos demandes dans la partie "réservation topo".</p>
            </div>
        </div>

        <%-- Mettre le lien vers la-dite partie ci-dessus --%>
    </div>
</section>
<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>

</body>
</html>
