package es.codeurjc.ais.tictactoe;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


/**
 *
 * @author Alvaro López
 */

@Entity
@Table(name = "PLAYER")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPlayer;
    private String label;
    private String name;
    private String apellido1;
    private String apellido2;
    private String email;
    private String pass;
    private long idpartida;
    private Integer totalPartidas;
    private Integer victorias;
    private Integer derrotas;
    private Integer empates;

    public Player() {
    }
    
    public Player(long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public Player(long idPlayer, String label, String name) {
        this.idPlayer = idPlayer;
        this.label = label;
        this.name = name;
    }
    
    public Player(String label, String name) {       
        this.label = label;
        this.name = name;
    }

    public Player(String label, String name, String apellido1, String apellido2,String email,String pass, long idpartida,Integer victorias, Integer derrotas, Integer empates, Integer totalPartidas) {
        
        this.label = label;
        this.name = name;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.pass = pass;
        this.idpartida = idpartida;
        this.victorias = victorias;
        this.derrotas= derrotas;
        this.empates = empates;  
        this.totalPartidas = totalPartidas;
    }

    public String getLabel() {
        return label;
    }

    public long getIdPlayer() {
        return idPlayer;
    }

    public String getName() {
        return name;
    }

    public long getIdpartida() {
        return idpartida;
    }

    public void setIdpartida(long idpartida) {
        this.idpartida = idpartida;
    }   

    public void setIdPlayer(long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getVictorias() {
        return victorias;
    }

    public void setVictorias(Integer victorias) {
        this.victorias = victorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Integer getTotalPartidas() {
        return totalPartidas;
    }

    public void setTotalPartidas(Integer totalPartidas) {
        this.totalPartidas = totalPartidas;
    }
    
    @Override
    public String toString() {
        return "Jugador [nombre=" + name + "]";
    }

}
