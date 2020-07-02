/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import boundary.AuthFacade;

/**
 *
 * @author fernanda
 */
public class ClassSingleton {
    
    private static AuthFacade INSTANCE;
    private String info = "Initial info class";
     
    private ClassSingleton() {        
    }
     
    public static AuthFacade getAuthFacade() {
        if(INSTANCE == null) {
            INSTANCE = new AuthFacade();
        }
         
        return INSTANCE;
    }
    
    
    
}
