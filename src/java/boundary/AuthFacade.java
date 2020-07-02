/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.*;

/**
 *
 * @author brend
 */

@Stateless
public class AuthFacade extends AbstractFacade<Usuario> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");

    private static AuthFacade INSTANCE;

    public static AuthFacade getAuthFacade() {
        if (INSTANCE == null) {
            INSTANCE = new AuthFacade();
        }
        return INSTANCE;
    }

    @Override
    protected EntityManager getEntityManager() {
        EntityManager em = emf.createEntityManager();
        return em;
    }

    public AuthFacade() {
        super(Usuario.class);
    }
//    
//    public Usuario criarUsuario ( Usuario usuario )  {
//        em.getTransaction().begin();
//        em.merge(usuario);
//        em.getTransaction().commit();
//        emf.close();
//        return usuario;
//    }

//    public Usuario loginUsuario ( Usuario usuario )  {
//        em.getTransaction().begin();
//        em.merge(usuario);
//        em.getTransaction().commit();
//        emf.close();
//        return usuario;
//    }
}
