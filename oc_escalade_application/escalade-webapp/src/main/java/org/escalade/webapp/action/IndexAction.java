package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.webapp.AbstractWebappImpl;

public class IndexAction extends AbstractWebappImpl {

    public String execute(){
        fillRegion();
        return ActionSupport.SUCCESS;
    }
}
