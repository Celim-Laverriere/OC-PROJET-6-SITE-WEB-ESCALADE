package org.escalade.business.contract.manager;

import org.escalade.model.bean.Voie;
import java.util.List;

public interface VoieManager {

     List<Voie> voies(Integer secteur_id);

     String addVoie(Voie voie);

     Voie voie(Integer id);

     String delVoie(Integer id);

     String upVoie(Voie voie );

     List<Voie>  rechercheSimpleParVoie(String motCleRecherche);
}
