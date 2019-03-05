package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Topo;


import javax.inject.Inject;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TopoAction extends ActionSupport implements SessionAware {

    private static final long serialVersionUID = 1L;

    private Integer TAILLE_TAMPON = 10240;
    private String CHEMIN_FICHIERS = "E:/PARCOURS DÉVELOPPEUR D'APPLICATION JAVA/PROJET 6 - CREEZ UN SITE COMMUNAUTAIRE AUTOUR DE L’ESCALADE/OC-PROJET-6-SITE-WEB-ESCALADE/oc_escalade_application/escalade-webapp/src/main/webapp/pdf_topos/";

    // =============== Attributs ===============
    private Integer topo_id;
    private Date date_upload;
    private File file;
    private String contentType;
    private String filename;


    // ----- Eléments en sortie -----
    private List<Topo> topos;
    private Topo topo;

    // ----- Eléments Struts
    private Map<String, Object> session;

    @Inject
    private ManagerFactory managerFactory;

    // ============ Getters/Setters ============

    public Integer getTopo_id() {
        return topo_id;
    }

    public void setTopo_id(Integer topo_id) {
        this.topo_id = topo_id;
    }

    public Date getDate_upload() {
        return date_upload;
    }

    public void setDate_upload(Date date_upload) {
        this.date_upload = date_upload;
    }

    public void setUpload(File file) {
        this.file = file;
    }

    public void setUploadContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setUploadFileName(String filename) {
        this.filename = filename;
    }

    public List<Topo> getTopos() {
        return topos;
    }

    public void setTopos(List<Topo> topos) {
        this.topos = topos;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }


// =============== Méthodes ================

    /**
     * Action listant les {@link Topo}
     * @return success
     */
    public String doList(){
        topos = managerFactory.getTopoManager().topos();
        return ActionSupport.SUCCESS;
    }

    /**
     * Action affichant les détails d'un {@Topo}
     * @return success / error
     */
    public String doDetail(){

        if (topo_id == null) {
            this.addActionError("Vous devez indiquer un id de topo");
        } else {
            try {
                topo = managerFactory.getTopoManager().topo(topo_id);
            } catch (Exception pEX) {
                this.addActionError("Topo non trouvé. ID = " + topo_id);
            }
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Action pour aouter un topo
     * @return
     */
    public String newTopo() throws IOException  {

        String vResult = ActionSupport.INPUT;

        System.out.println(filename);
        System.out.println(contentType);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();
        System.out.println("Aujourd'hui : " + dateFormat.format(date));

        BufferedInputStream entree = null;
        BufferedOutputStream sortie = null;

            try {

                try {
                    entree = new BufferedInputStream(new FileInputStream((file)));
                    sortie = new BufferedOutputStream(new FileOutputStream(new File(CHEMIN_FICHIERS + filename)), TAILLE_TAMPON);

                    byte[] tampon = new byte[TAILLE_TAMPON];
                    int longueur;
                    while ((longueur = entree.read(tampon)) > 0) {
                        sortie.write(tampon, 0, longueur);
                    }
                } finally {
                    try {
                        sortie.close();
                    } catch (IOException ignore) {
                    }
                    try {
                        entree.close();
                    } catch (IOException ignore) {
                    }
                }

                vResult = ActionSupport.SUCCESS;

            } catch(NullPointerException pEX){
                System.out.println(pEX);
                this.addActionError("Attention la photo et trop voluminueuse !");

            }




        return vResult;
    }

    // ======================== Session =========================
    @Override
    public void setSession(Map<String, Object> pSession) {

        this.session = pSession;
    }
}
