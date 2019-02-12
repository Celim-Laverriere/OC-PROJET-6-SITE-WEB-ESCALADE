<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 11/02/2019
  Time: 07:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <%@include file="../_include/head.jsp"%>
</head>

<body>

<header>
    <%@include file="../_include/header.jsp"%>
</header>

<div id="configSelectFormulaire"><s:property  value="configSelectFormulaire"/></div>

<div class="container">

    <%-- =============================== --%>
    <%-- ==== Formulaire navigation ==== --%>
    <%-- =============================== --%>

    <div class="row">
        <div class="col-md-12" style="margin-top: 2%">
            <ul class="nav nav-tabs" id="navFormulaire">
                <li class="nav-item" id="navSite">
                    <a class="nav-link" href="#">Site</a>
                </li>
                <li class="nav-item" id="navSecteur">
                    <a class="nav-link" href="#">Secteur</a>
                </li>
                <li class="nav-item" id="navVoie">
                    <a class="nav-link" href="#">Voie</a>
                </li>
                <li class="nav-item" id="navLongueurRelai">
                    <a class="nav-link" href="#">Longueurs & Relais</a>
                </li>
            </ul>
        </div>
    </div>

    <%-- ========================= --%>
    <%-- ==== Formulaire Site ==== --%>
    <%-- ========================= --%>

    <div class="row" id="formulaireSite">

        <div class="col-md-12" style="text-align: center; margin-top: 2%">
            <h4>Création d'un nouveau sites d'éscalades</h4>
        </div>

        <div class="col-md-12">
            <s:form action="complete_creation_climbing_site">
                <div class="form-group">
                    <label for="inputNomSite">Nom du site</label>
                    <input name="site.nom" id="inputNomSite" type="text" class="form-control" style="width: 100%" required="true">
                </div>
                <div class="form-group">
                    <label for="selectRegion">Région</label>
                    <select name="site.region" id="selectRegion" required="true" class="form-control"
                            style="width: 100%">
                        <c:forEach var="region" items="${regions}">
                            <option><c:out value="${region}"/></option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label for="textareaDescriptionSite">Description du site</label>
                    <textarea name="site.description" id="textareaDescriptionSite" rows="5" class="form-control" style="width: 100%"></textarea>
                </div>

                <div class="row justify-content-end">
                    <div class="col-md-1">
                        <select name="configSelectFormulaire" required="true" class="form-control" checked style="display: none">
                            <option>formulaireSite</option>
                        </select>
                        <button class="btn btn-primary" type="submit">Suivant</button>
                    </div>
                    <!-- Button trigger modal -->
                    <div class="col-md-1">
                        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#modal">
                            Annuler
                        </button>
                    </div>
                </div>
            </s:form>

        </div>
    </div>


    <%-- ============================== --%>
    <%-- ===== Formulaire secteur ===== --%>
    <%-- ============================== --%>

    <div class="row" id="formulaireSecteur">

        <div class="col-md-12" style="text-align: center">
            <h4>Création d'un nouveau secteur</h4>
        </div>

        <div class="col-md-12">
            <s:form action="complete_creation_climbing_site">
                <div class="form-group">

                    <label for="inputNomSecteur">Nom du secteur</label>
                    <input name="secteur.nom" id="inputNomSecteur" type="text" class="form-control" style="width: 100%" requiredLabel="true"
                           required="true">

                    <label for="textareaDescriptionSecteur">Description du secteur</label>
                    <textarea name="secteur.description" id="textareaDescriptionSecteur" cols="40" rows="5" class="form-control"
                              style="width: 100%"></textarea>
                </div>

                <div class="row justify-content-end">
                    <div class="col-md-1">
                        <select name="configSelectFormulaire" required="true" class="form-control" checked style="display: none">
                            <option>formulaireSecteur</option>
                        </select>
                        <button class="btn btn-primary" type="submit">Validez</button>
                    </div>
                    <!-- Button trigger modal -->
                    <div class="col-md-1">
                        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#modal">
                            Annuler
                        </button>
                    </div>
                </div>

            </s:form>
        </div>
    </div>

    <%-- =============================== --%>
    <%-- ======= Formulaire voie ======= --%>
    <%-- =============================== --%>

    <div class="row" id="formulaireVoie">

        <div class="col-md-12" style="text-align: center">
            <h4>Création d'une nouvelle Voie !</h4>
        </div>

        <div class="col-md-12">
            <s:form action="complete_creation_climbing_site">
                <div class="form-group">

                    <label for="inputNomVoie">Nom du secteur</label>
                    <input name="voie.nom" id="inputNomVoie" type="text" class="form-control" style="width: 100%" requiredLabel="true"
                           required="true">

                    <label for="typeVoieRadios">Type de la voie</label>
                    <fieldset name="voie.type_voie" class="form-group" id="typeVoieRadios">
                        <c:forEach var="type" items="${types_voie}">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input" type="radio" name="gridRadios" id="typeVoie">
                                <label class="form-check-label" for="typeVoie">
                                    <c:out value="${type}"/>
                                </label>
                            </div>
                        </c:forEach>
                    </fieldset>

                    <label for="selectCotationVoie">Cotation de la voie</label>
                    <select name="voie.cotation" id="selectCotationVoie" name="site.region" required="true" class="form-control"
                            style="width: 100%">
                        <c:forEach var="cotation" items="${cotations}">
                            <option><c:out value="${cotation}"/></option>
                        </c:forEach>
                    </select>

                    <label for="inputHauteurVoie">Hauteur de la voie</label>
                    <input name="voie.hauteur" id="inputHauteurVoie" type="text" class="form-control" style="width: 100%" required="true">

                    <label for="textareaDescriptionVoie">Description du secteur</label>
                    <textarea name="voie.description" id="textareaDescriptionVoie" cols="40" rows="5" class="form-control"
                              style="width: 100%"></textarea>
                </div>

                <div class="row justify-content-end">

                    <div class="col-md-1">
                        <select name="configSelectFormulaire" required="true" class="form-control" checked style="display: none">
                            <option>formulaireVoie</option>
                        </select>
                        <button class="btn btn-primary" type="submit">Validez</button>
                    </div>
                    <!-- Button trigger modal -->
                    <div class="col-md-1">
                        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#modal">
                            Annuler
                        </button>
                    </div>
                </div>
            </s:form>

        </div>
    </div>

    <%-- ============================================== --%>
    <%-- ======= Formulaire Longueurs et relais ======= --%>
    <%-- ============================================== --%>
    <div class="row" id="formulaireLongueurRelai">

        <div class="col-md-12" style="text-align: center">
            <h2>Création des longueurs et des relais !</h2>
            <hr width="100%" color="#DCDCDC">
        </div>

        <div class="col-md-12">
            <s:form action="">
                <div class="form-group">

                    <label for="inputHauteurLongueur">Hauteur de la longueur N°<span id="numero"></span></label>
                    <input id="inputHauteurLongueur" type="number" class="form-control" style="width: 100%"
                           required="true">

                    <label for="selectCotationLongueur">Cotation de la longueur</label>
                    <select id="selectCotationLongueur" name="site.region" required="true" class="form-control"
                            style="width: 100%">
                        <c:forEach var="cotation" items="${cotations}">
                            <option><c:out value="${cotation}"/></option>
                        </c:forEach>
                    </select>

                    <label for="relaiRadios">Relai</label>
                    <small id="relaiHelp" class="form-text text-muted">
                        Indiquez s'il y a un relai à la fin de cette longueur !.
                    </small>
                    <fieldset class="form-group" id="relaiRadios">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="gridRadios" id="relaiOui">
                            <label class="form-check-label" for="relaiOui">
                                Oui il y a un relai !
                            </label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="gridRadios" id="relaiNon">
                            <label class="form-check-label" for="relaiNon">
                                Non il n'y a pas de relai !
                            </label>
                        </div>
                    </fieldset>
                </div>

                <div class="row justify-content-end">

                    <div class="col-md-1">
                        <button class="btn btn-primary" type="submit">Validez</button>
                    </div>
                    <!-- Button trigger modal -->
                    <div class="col-md-1">
                        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#modal">
                            Annuler
                        </button>
                    </div>
                </div>

            </s:form>


        </div>
    </div>

</div>

<!-- Modal -->
<div class="modal fade" id="modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="secteurModalL">Quitter le formulaire !</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Confirmez l'annulation de la création d'un nouveau site !
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary"
                        data-dismiss="modal">Annulez</button>
                <s:a action="choixCreate">
                    <button type="button" class="btn btn-primary">Confirmez</button>
                </s:a>
            </div>
        </div>
    </div>
</div>

<span id="test"></span>

<footer>
    <%@include file="../_include/footer.jsp"%>
</footer>

<script src="javaScript/formulaire_site_complet.js"></script>

</body>

</html>
