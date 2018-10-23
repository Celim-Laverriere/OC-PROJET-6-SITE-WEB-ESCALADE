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

    <div>
      <nav>
          <button><s:a action="site_list">Liste des sites</s:a></button>
          <button><s:a action="topo_list">Litste des topos</s:a></button>
          <button><s:a action="index">Accueil</s:a> </button>
      </nav>

    </div>

