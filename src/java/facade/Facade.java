/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.*;
/**
 *
 * @author brend
 */
public class Facade {
    EntityManager em;
    EntityManagerFactory emf;
    
    public Facade() {
        emf = Persistence.createEntityManagerFactory("usuario");
        em = emf.createEntityManager();
    }
    
    public Usuario criarUsuario ( Usuario usuario )  {
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
        emf.close();
        return usuario;
    }


}
