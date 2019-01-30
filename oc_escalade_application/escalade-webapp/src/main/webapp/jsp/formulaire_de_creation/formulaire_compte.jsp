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

<div>
    <s:if test="!#session.user">
        <%@include file="../_include/header.jsp"%>
    </s:if>
    <s:else>
        <%@include file="../_include/formulaireChoixCreate.jsp"%>
    </s:else>

</div>

<div class="container" style=" position: absolute; top: 14%; left: 40%">

    <s:if test="!#session.user">

    <h2> Creez votre compte OC Escalade</h2>

    <s:form action="creerCompte">
        <s:textfield name="compte.nom" label="Nom" required="true" requiredLabel="true"/>
        <s:textfield name="compte.prenom" label="Prenom" required="true" requiredLabel="true"/>
        <s:textfield name="compte.mail" label="E-mail" required="true" requiredLabel="true"/>
        <s:password name="compte.mot_de_passe" label="Mote de passe" required="true" requiredLabel="true"/>
        <s:submit value="Validez"/>
    </s:form>
    </s:if>
    <s:else>

    <div style="margin-top: 10px">
        <h3>Modifier le compte</h3>
        <s:form action="modifier_compte_utilisateur">

            <s:textfield name="upCompte.nom" label="Nom" required="true"
                         value="%{compte.nom}" key="nom"/>
            <s:textfield name="upCompte.prenom" label="prenom" required="true"
                         value="%{compte.prenom}" key="prenom"/>
            <s:textfield name="upCompte.mail" label="mail" required="true"
                         value="%{compte.mail}" key="mail"/>
            <s:password name="upCompte.mot_de_passe" label="mot_de_passe" required="true"
                        value="%{compte.mot_de_passe}" key="mot_de_passe"/>
            <s:submit value="Validez"/>

        </s:form>

        <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
            Supprimer le compte !
        </button>

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
        </s:else>
    </div>

    <h2><s:actionmessage/></h2>
    <h2><s:actionerror/></h2>

    <script>
        <%@include file="../_include/footer.jsp"%>
    </script>
</body>

</html>
