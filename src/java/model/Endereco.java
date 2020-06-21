/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author fernanda
 */
@Entity()
@Table(name="endereco")
public class Endereco {

       
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @ManyToOne
    private Cidade cidade;

    @Column
    private String complemento;

    @Column
    private Integer numeroRua;

    @Column
    private String bairro;

    @Column
    private String rua;

    @Column
    private String cep;

    @ManyToOne
    private Estado estado;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    
    
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(Integer numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
