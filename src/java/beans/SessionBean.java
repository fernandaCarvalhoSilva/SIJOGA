package beans;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */
@Named
public class SessionBean {
    
    public boolean isScope(String name) {
        return name.equals("advogado");
    }
    
    public String getScope() {
        return "advogado";
    }
}
