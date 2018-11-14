<%--
  Created by IntelliJ IDEA.
  User: CELIM
  Date: 19/10/2018
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

    <h2>Bienvenue sur l'application de référencement de sites d'escalade !</h2>
<header>
    <s:if test="#session.user">
        Utilisateur connecté :
        <s:property value="#session.user.prenom"/>
        <s:property value="#session.user.nom"/><br/>
    <p>
        <button><s:a action="choixCreate">Nouveau site</s:a></button>
        <button><s:a action="logout">Déconnexion</s:a></button>
    </p>

    </s:if>
    <s:else>
        <s:a action="login">Connexion</s:a>
    </s:else>

</header>

    <div>
      <nav>
          <button><s:a action="site_list">Liste des sites</s:a></button>
          <button><s:a action="topo_list">Litste des topos</s:a></button>
          <button><s:a action="index">Accueil</s:a> </button>
          <button><s:a action="recherche_avancer">Recherche</s:a> </button>
      </nav>

    </div>




