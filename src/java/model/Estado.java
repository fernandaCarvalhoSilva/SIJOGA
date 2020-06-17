/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author fernanda
 */
public class Estado {

    @Id
    private Long ID;

    @Column
    private String nome;

    @Column
    private String uf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getUF() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
