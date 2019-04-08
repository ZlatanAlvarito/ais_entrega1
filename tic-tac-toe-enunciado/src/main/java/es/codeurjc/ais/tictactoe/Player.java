package es.codeurjc.ais.tictactoe;

import java.util.ArrayList;
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
    private ArrayList<Partidas> partidas;

    public Player() {
    }

    public Player(long idPlayer, String label, String name) {
        this.idPlayer = idPlayer;
        this.label = label;
    }

    public Player(String name, ArrayList<Partidas> partidas) {
        this.name = name;
        this.partidas = partidas;
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

    public ArrayList<Partidas> getPartidas() {
        return partidas;
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

    public void setPartidas(ArrayList<Partidas> partidas) {
        this.partidas = partidas;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + name + "]";
    }

}
