<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 26/11/2018
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>

<body>

<s:if test="!#session.user">

    <%@include file="../_include/head.jsp"%>

    <%@include file="../_include/header.jsp"%>

    <div class="container" style="margin-top: 2%">
        <div class="row justify-content-md-center">
            <div class="col-md-6">
                <h4>Creez votre compte OC Escalade</h4>

                <s:form action="creerCompte">
                    <div class="form-group">
                        <label for="exampleInputNom">Nom</label>
                        <input name="compte.nom" type="text" class="form-control"
                               id="exampleInputNom" aria-describedby="emailHelp" placeholder="Nom">

                        <label for="exampleInputPrenom">Prénom</label>
                        <input name="compte.prenom" type="text" class="form-control"
                               id="exampleInputPrenom" aria-describedby="emailHelp" placeholder="Prénom">

                        <label for="exampleInputEmail1">Email address</label>
                        <input name="compte.mail"  type="email" class="form-control"
                               id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                        <small id="emailHelp" class="form-text text-muted">
                            Nous ne partagerons jamais votre courriel avec qui que ce soit d'autre.
                        </small>
                    </div>

                    <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input name="compte.mot_de_passe" type="password" class="form-control"
                               id="exampleInputPassword1" placeholder="Password">
                    </div>

                    <button type="submit" class="btn btn-primary">Validez</button>
                </s:form>

            </div>
        </div>
    </div>

    <footer>
        <%@include file="../_include/footer.jsp"%>
    </footer>
</s:if>

<s:if test="#session.user">

    <%@include file="../_include/formulaireChoixCreate.jsp"%>

    <div class="container" style="position: absolute; top: 14%; left: 29%">
        <div class="row justify-content-md-center">
            <div class="col-md-6">
                <h4>Modifier le compte</h4>

                <s:form action="modifier_compte_utilisateur">
                    <s:iterator value="compte">

                        <div class="form-group">
                            <label for="exampleInputNom">Nom</label>
                            <input name="upCompte.nom" value="<s:property value="nom"/>" type="text" class="form-control"
                                   id="exampleInputNomMoif" aria-describedby="emailHelp"/>

                            <label for="exampleInputPrenom">Prénom</label>
                            <input name="upCompte.prenom" value="<s:property value="prenom"/>" type="text" class="form-control"
                                   id="exampleInputPrenomMoif" aria-describedby="emailHelp"/>

                            <label for="exampleInputEmail1">Email address</label>
                            <input name="upCompte.mail" value="<s:property value="mail"/>" type="email" class="form-control"
                                   id="exampleInputEmail1Moif" aria-describedby="emailHelp"/>
                            <small id="emailHelpMoif" class="form-text text-muted">
                                Nous ne partagerons jamais votre courriel avec qui que ce soit d'autre.
                            </small>
                        </div>

                        <div class="form-group">
                            <label for="exampleInputPassword1">Password</label>
                            <input name="upCompte.mot_de_passe" value="<s:property value="mot_de_passe"/>" type="password"
                                   class="form-control" id="exampleInputPassword1Moif"/>
                        </div>

                        <div class="row">
                            <div class="col-md-3">
                                <button type="submit" class="btn btn-primary">Validez</button>
                            </div>

                            <!-- Button trigger modal -->
                            <div class="col-md-5">
                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                                    Supprimer le compte !
                                </button>
                            </div>
                        </div>

                    </s:iterator>
                </s:form>

            </div>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Supprimer compte</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    Confirmez la suppression de votre compte!
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary"
                            data-dismiss="modal">Annulez</button>
                    <s:a action="supprimer_compte">
                        <button type="button" class="btn btn-primary">Confirmez</button>
                    </s:a>
                </div>
            </div>
        </div>
    </div>

</s:if>

</body>

</html>
