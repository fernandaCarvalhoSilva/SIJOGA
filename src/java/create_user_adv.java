
import facade.Facade;
import java.util.Scanner;
import model.*;
import org.hibernate.Session;
import util.HibernateUtil;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brendon ferreira
 */
public class create_user_adv {
    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("PASSWORD: ");
        String password = scanner.nextLine();
        
        
        
        Usuario usuarioAdv = new Usuario();
        usuarioAdv.setCpf( cpf );
        usuarioAdv.setPassword( password );

        Advogado advogado = new Advogado();
        advogado.setUsuario( usuarioAdv );

        
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(usuarioAdv);
        session.save(advogado);
        session.getTransaction().commit();
        session.close();
        

        String passwordset = "";
        while( !usuarioAdv.verifyPassword(passwordset) ) {
            System.out.println("PASSWORD: ");
            passwordset = scanner.nextLine();
        }
        
        
        
//        Facade facade = new Facade(); 
//        System.out.println( facade.criarUsuario(usuario) );
    }
}
