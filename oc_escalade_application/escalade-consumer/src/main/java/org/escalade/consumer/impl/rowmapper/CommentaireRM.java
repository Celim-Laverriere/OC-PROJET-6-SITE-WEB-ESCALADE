package org.escalade.consumer.impl.rowmapper;

import org.escalade.model.bean.Commentaire;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentaireRM {

    public RowMapper<Commentaire> getvCommentaireRowMapper() {
        return vCommentaireRowMapper;
    }

    RowMapper<Commentaire> vCommentaireRowMapper = new RowMapper<Commentaire>() {
        @Override
        public Commentaire mapRow(ResultSet pRs, int rowNum) throws SQLException {
            Commentaire vCommentaire = new Commentaire();
            vCommentaire.setId(pRs.getInt("id"));
            vCommentaire.setCommentaire(pRs.getString("commentaire"));
            return vCommentaire;
        }
    };
}
