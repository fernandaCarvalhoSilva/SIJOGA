/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author fernanda
 */
@Entity
@Table(name="parte")
public class Parte {

    @Id
    private Long ID;
    
    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;
    
    @OneToMany
    private List<Advogado> advogado;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
}
