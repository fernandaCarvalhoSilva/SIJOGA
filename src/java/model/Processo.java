/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 *
 * @author fernanda
 */

@Entity
@Table(name="processo")
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @Column()
    private Date dataDeAbertura;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parte_promovente_id")
    private Parte partePromovente;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parte_promovida_id")
    private Parte partePromovida;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parte_vitoriosa_id")
    private Parte parteVitoriosa;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "juiz_id")
    private Juiz juiz;

    
    @PrePersist
    protected void onCreate() {
      this.dataDeAbertura = new Date();
    }
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(Date dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public Parte getPartePromovente() {
        return partePromovente;
    }

    public void setPartePromovente(Parte partePromovente) {
        this.partePromovente = partePromovente;
    }

    public Parte getPartePromovida() {
        return partePromovida;
    }

    public void setPartePromovida(Parte partePromovida) {
        this.partePromovida = partePromovida;
    }

    public Parte getVitoriosa() {
        return parteVitoriosa;
    }

    public void setVitoriosa(Parte parteVitoriosa) {
        this.parteVitoriosa = parteVitoriosa;
    }

    public Juiz getJuiz() {
        return juiz;
    }

    public void setJuiz(Juiz juiz) {
        this.juiz = juiz;
    }
    
    
}
