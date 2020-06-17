/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import util.Passwords;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Base64;

/**
 *
 * @author fernanda
 */
@Entity()
@Table(name="usuario")
public class Usuario {
    
    @Id
    private String cpf;

    
    @Column
    private String sobrenome;

    @Column
    private String telefone;
    
    @Column
    private String email;
    
    @Column
    private String hashed_password;

    @Column
    private String password_salt;
    
    @Column
    private String nome;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashed_password() {
        return hashed_password;
    }

    public void setPassword(String password) {
        byte[]salt = Passwords.getNextSalt();
        this.password_salt = Base64.getEncoder().encodeToString(salt);
        this.hashed_password = Base64.getEncoder().encodeToString(Passwords.hash(password.toCharArray(), password_salt.getBytes()));
    }

    public boolean verifyPassword(String password) {
        byte[] hashedPasswordBytes = Base64.getDecoder().decode( hashed_password );
        return Passwords.isExpectedPassword(password.toCharArray(), password_salt.getBytes(), hashedPasswordBytes);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
