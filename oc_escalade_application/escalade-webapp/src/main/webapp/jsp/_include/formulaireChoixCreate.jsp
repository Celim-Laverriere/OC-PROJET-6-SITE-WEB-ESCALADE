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
    <body>

        <header>
            <%@include file="header.jsp"%>
        </header>

        <div class="container" style="margin-top: 10px">
            <div class="row">
                <div class="col-md-3" style="border-style: solid; border-width: 1px; box-shadow: 6px 6px 6px black; border-radius: 10px">
                    <ul class="nav nav-pills">
                        <li class="nav-item dropdown">
                            <s:a action="modifier_compte_utilisateur"
                                 class="dropdown-item">MES INFOS PERSO</s:a>
                        </li>
                    </ul>
                    <ul class="nav nav-pills">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                               role="button" aria-haspopup="true" aria-expanded="false">MES SITES</a>
                            <div class="dropdown-menu">
                                <s:a action="new_site" class="dropdown-item">Créer un nouveau Site d'escalade</s:a>
                                <s:a action="sites_Par_Session_De_Compte" class="dropdown-item">Afficher mes sites d'éscalades !</s:a>
                            </div>
                        </li>
                    </ul>
                    <ul class="nav nav-pills">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                               role="button" aria-haspopup="true" aria-expanded="false">MES SECTEURS</a>
                            <div class="dropdown-menu">
                                <s:a action="new_secteur" class="dropdown-item">Créer un nouveau Secteurs</s:a>
                                <s:a class="dropdown-item"> Afficher mes secteurs !</s:a>
                            </div>
                        </li>
                    </ul>
                    <ul class="nav nav-pills">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                               role="button" aria-haspopup="true" aria-expanded="false">MES VOIES</a>
                            <div class="dropdown-menu">
                                <s:a action="" class="dropdown-item">Créer un nouvelle Voie</s:a>
                                <s:a action="" class="dropdown-item"> Afficher mes Voies !</s:a>
                            </div>
                        </li>
                    </ul>
                    <ul class="nav nav-pills">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                               role="button" aria-haspopup="true" aria-expanded="false">MES RELAIS</a>
                            <div class="dropdown-menu">
                                <s:a action="" class="dropdown-item">Créer un nouveau Relai</s:a>
                                <s:a action="" class="dropdown-item"> Afficher mes Relais !</s:a>
                            </div>
                        </li>
                    </ul>
                    <ul class="nav nav-pills">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                               role="button" aria-haspopup="true" aria-expanded="false">MES LONGUEURES</a>
                            <div class="dropdown-menu">
                                <s:a action="" class="dropdown-item">Créer un nouvelle Longueure</s:a>
                                <s:a action="" class="dropdown-item"> Afficher mes Longueure !</s:a>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="col-md-9">
                    <h2><s:actionmessage/></h2>
                    <h2><s:actionerror/></h2>
                </div>
            </div>
        </div>


        <script>
            <%@include file="../_include/footer.jsp"%>
        </script>

    </body>

</html>
