<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 19/10/2018
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<head>
    <%@include file="../_include/head.jsp"%>
</head>

<body>
    <header>

        <div class="container" style="background:#609987; margin-top: 10px;  box-shadow: 6px 6px 6px black;  border-radius: 10px;">
            <div class="row">

                <div class="col-md-4">
                    <h1>OC Escalade !</h1>
                </div>

                <div class="col-md-6" style="margin-top: 7px">
                    <s:form action="barre_de_recherche" class="nav navbar-form" style="">
                        <input type="search" name="motCleRecherche" style="width: 400px" class="form-control" placeholder="Rechercher un site d'escalade"/>
                        <button type="submit" style="margin-left: 4px" class="btn btn-primary btn-md">Validez</button>
                    </s:form>
                </div>

                <div class="dropdown" style="margin-top: 8px">
                        <button type="button" class="btn btn-success dropdown-toggle"
                            data-toggle="dropdown">Mon compte</button>
                        <ul class="dropdown-menu">
                            <s:if test="!#session.user">
                                <li><s:a action="login">Connexion</s:a></li>
                                <li><s:a action="creerCompte">Creer mon compte</s:a></li>
                            </s:if>
                            <s:else>
                                <li><s:a action="choixCreate">COMPTE</s:a></li>
                                <li><s:a action="logout">Déconnexion</s:a></li>
                            </s:else>
                        </ul>
                </div>

                <div>
                    <ul class="nav nav-tabs" style="margin-bottom: 8px; margin-left: 5px">
                        <li class="nav-link"><s:a action="index" style="color: black; font-weight:bold" >Accueil</s:a></li>
                        <li class="nav-link"><s:a action="site_list" style="color: black; font-weight:bold">Liste des sites</s:a></li>
                        <li class="nav-link"><s:a action="topo_list" style="color: black; font-weight:bold">Litste des topos</s:a></li>
                        <li class="nav-link"><s:a action="recherche_avancer" style="color: black; font-weight:bold">Recherche</s:a> </li>
                    </ul>
                </div>
                <div style="margin-top: 9px; margin-left: 200px" class="col-md-4">
                    <h5>
                        <s:if test="#session.user">
                            Utilisateur connecté :
                            <s:property value="#session.user.prenom"/>
                            <s:property value="#session.user.nom"/><br/>
                        </s:if>
                    </h5>
                </div>
                
            </div>

        </div>

    </header>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>






