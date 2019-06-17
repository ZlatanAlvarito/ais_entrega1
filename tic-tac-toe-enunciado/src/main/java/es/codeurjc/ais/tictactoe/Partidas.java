/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.codeurjc.ais.tictactoe;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ALVARO
 */
@Entity
@Table(name = "PARTIDAS")
public class Partidas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPartida;    
    private Integer dinero;
    

    public Partidas() {

    }

    public Partidas(long idPartida) {
        this.idPartida = idPartida;
    }
    
    public Partidas(long id,Integer dinero){
        this.idPartida = idPartida;
        this.dinero = dinero;           
    
    }

    public long getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(long idPartida) {
        this.idPartida = idPartida;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }
    
    @Override
    public String toString() {
        return "Partida [Apuesta = " + dinero +"]";
    }

}
