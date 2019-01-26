<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 26/10/2018
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
    <body>
        <header>
            <%@include file="header.jsp"%>
        </header>

        <div class="container" style="margin-top: 10px">
            <div class="row">
                <div class="col-md-3" style="border-style: solid; border-width: 1px; box-shadow: 6px 6px 6px black;  border-radius: 10px;">
                    <ul class="nav nav-pills">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
                               role="button" aria-haspopup="true" aria-expanded="false">MES SITES</a>
                            <div class="dropdown-menu">
                                <s:a action="new_site" class="dropdown-item">Créer un nouveau Site d'escalade</s:a>
                                <s:a action="" class="dropdown-item">Afficher mes sites d'éscalades !</s:a>
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
                </div>
            </div>
        </div>

        <div class="col-md-8">
            <li class="nav-item" style="margin-left: 0px">MES VOIES</li>
            <li class="nav-item" style="margin-left: 0px">TABLEAU DE BORD</li>
            <li class="nav-item dropdown" style="margin-left: 0px">MES INFOS PERSO</li>
            <button><s:a action="">Créer un nouvelle Voie</s:a> </button>
            <button><s:a action="">Créer un nouveau Relai</s:a> </button>
            <button><s:a action="">Créer une nouvelle Longueure</s:a></button>
        </div>

        <h2><s:actionmessage/></h2>
        <h2><s:actionerror/></h2>


        <footer>

        </footer>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>

    </body>

</html>
