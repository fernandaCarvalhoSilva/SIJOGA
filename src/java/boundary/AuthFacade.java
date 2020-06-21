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
import javax.persistence.PersistenceContext;
import model.*;
/**
 *
 * @author brend
 */

@Stateless
public class AuthFacade extends AbstractFacade<Usuario> {
    
    EntityManager em;
     
    
    
    @Override
    protected EntityManager getEntityManager() {
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
