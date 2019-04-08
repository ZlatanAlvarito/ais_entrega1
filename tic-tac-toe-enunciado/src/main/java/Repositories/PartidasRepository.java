/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

/**
 *
 * @author ALVARO
 */


import es.codeurjc.ais.tictactoe.Partidas;
import es.codeurjc.ais.tictactoe.Player;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidasRepository extends JpaRepository<Partidas, Long> {
 
    Partidas findByIdPartida(long idPartida);        
   
}
