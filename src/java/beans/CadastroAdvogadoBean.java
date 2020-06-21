package beans;


import boundary.AuthFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import model.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brend
 */

@ManagedBean(name="cadastroAdvogadoBean")
public class CadastroAdvogadoBean implements Serializable {
    public String nome;
    public String email;
    public String oab;
    public String senha;
    
    
    @EJB
    AuthFacade auth;
    
       
    public boolean signUp( ) {
        
        
        System.out.println("HELLO!!!!!!!!");
        
        Usuario user = new Usuario();
        
        user.setEmail(email);
        user.setPassword(senha);
        
        try {
            auth.create(user);
        } catch(NullPointerException e) {
            System.out.println(e);
        }
        
        return true;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
