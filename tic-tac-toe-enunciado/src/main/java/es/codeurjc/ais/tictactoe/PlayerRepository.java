/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.codeurjc.ais.tictactoe;


import es.codeurjc.ais.tictactoe.Player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ALVARO
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
       
	Player findById(long id);        
        Player findByName(String name);        
        Player findByLabel(String label);        
        

	
}
    

