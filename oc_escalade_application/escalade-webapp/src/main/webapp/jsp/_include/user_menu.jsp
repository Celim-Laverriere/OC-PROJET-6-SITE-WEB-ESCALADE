<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 26/10/2018
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
    <%@include file="../_include/head.jsp"%>
</head>
<body>

<header>
    <%@include file="header.jsp"%>
</header>

<div class="container" style="margin-top: 1%">
    <div class="row">
        <div class="col-md-12" style="border-style: solid; border-color: #DCDCDC; border-width: 2px;
             border-radius: 10px; box-shadow: 6px 6px 14px #DCDCDC">
            <ul class="nav nav-tabs">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                       role="button" aria-haspopup="true" aria-expanded="false">MES SITES</a>
                    <div class="dropdown-menu">
                        <s:a action="complete_creation_climbing_site" class="dropdown-item">
                            Créer un nouveau Site d'escalade complet
                        </s:a>
                        <s:a action="new_site" class="dropdown-item">Créer un nouveau Site d'escalade</s:a>
                        <s:a action="sites_Par_Session_De_Compte" class="dropdown-item">Afficher mes sites d'éscalades !</s:a>
                    </div>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                       role="button" aria-haspopup="true" aria-expanded="false">MES SECTEURS</a>
                    <div class="dropdown-menu">
                        <s:a action="new_secteur" class="dropdown-item">Créer un nouveau Secteurs</s:a>
                        <s:a action="secteurs_Par_Session_De_Compte" class="dropdown-item"> Afficher mes secteurs !</s:a>
                    </div>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                       role="button" aria-haspopup="true" aria-expanded="false">MES VOIES</a>
                    <div class="dropdown-menu">
                        <s:a action="" class="dropdown-item">Créer un nouvelle Voie</s:a>
                        <s:a action="" class="dropdown-item"> Afficher mes Voies !</s:a>
                    </div>
                </li>


                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                       role="button" aria-haspopup="true" aria-expanded="false">MES LONGUEURES & RELAIS</a>
                    <div class="dropdown-menu">
                        <s:a action="" class="dropdown-item">Créer un nouvelle Longueure et relais</s:a>
                        <s:a action="" class="dropdown-item"> Afficher mes Longueure et relais !</s:a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>

<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>

</body>

</html>
