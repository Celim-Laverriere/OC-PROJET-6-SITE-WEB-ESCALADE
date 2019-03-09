package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.CompteManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Commentaire;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.ResaTopo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CompteManagerImpl extends AbstractManagerImpl implements CompteManager {

    @Override
    public List<Compte> comptes() {
        return getDaoFactory().getCompteDao().comptes();
    }

    @Override
    public void addCompte(Compte compte) {
        getDaoFactory().getCompteDao().addCompte(compte);
    }

    @Override
    public Compte compte(Compte compte_id) {
        return getDaoFactory().getCompteDao().compte(compte_id);
    }

    @Override
    public void delCompte(Compte compte_id) {

        getDaoFactory().getCompteDao().delCompte(compte_id.getId());
    }

    @Override
    public void upCompte(Compte upComte, Compte compte) {
        getDaoFactory().getCompteDao().upCompte(upComte, compte);
    }

    @Override
    public Compte comptByUtilisateur(String login, String password) {

        Compte vUtilisateur = getDaoFactory().getCompteDao().comptByUtilisateur(login, password);
        return vUtilisateur;
    }

    public List<Compte> compteByCommentaires(List<Commentaire> commentaireList){

        List<Compte> compteList = new ArrayList<>();

        for (Commentaire commentaire : commentaireList){

            /**@see org.escalade.consumer.impl.dao.CompteImpl#compteByCommentairesDao(Commentaire)*/
            List<Compte> compteListTemp = getDaoFactory().getCompteDao().compteByCommentairesDao(commentaire);
            compteList.addAll(compteListTemp);
        }
        return compteList;
    }

    public List<Compte> compteByResaTopo(List<ResaTopo> resaTopoList){

        List<Compte> compteList = new ArrayList<>();
        HashSet<Integer> compte_idHashSet = new HashSet<>();

        for (ResaTopo resaTopo: resaTopoList){
            compte_idHashSet.add(resaTopo.getCompte_id());
        }

        for (Integer compte_id : compte_idHashSet){
            /**@see org.escalade.consumer.impl.dao.CompteImpl#compteByResaTopoDao(Integer)*/
            List<Compte> compteListTemp = getDaoFactory().getCompteDao().compteByResaTopoDao(compte_id);
            compteList.addAll(compteListTemp);
        }

        return compteList;
    }

    public List<Compte> ownerAccountByResaTopo (List<ResaTopo> resaTopoList){

        List<Compte> compteList = new ArrayList<>();
        HashSet<Integer> topo_idHashSet = new HashSet<>();

        for (ResaTopo resaTopo : resaTopoList){
            topo_idHashSet.add(resaTopo.getTopo_id());
        }

        for (Integer topo_id : topo_idHashSet){
            /**@see org.escalade.consumer.impl.dao.CompteImpl#ownerAccountByResaTopoDao(Integer)*/
            List<Compte> compteListTemp = getDaoFactory().getCompteDao().ownerAccountByResaTopoDao(topo_id);
            compteList.addAll(compteListTemp);
        }
        return compteList;
    }

}
