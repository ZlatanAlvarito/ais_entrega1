/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.codeurjc.ais.tictactoe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ALVARO
 */
@Controller
public class PlayerController {
    
    @Autowired
    private PlayerRepository repositorioPlayer;
    @PostMapping("/añadir/player")
    public String añadirJugador(@RequestParam String label,@RequestParam String name, @RequestParam String apellido1, @RequestParam String apellido2,@RequestParam String email,@RequestParam String pass,@RequestParam long idpartida,@RequestParam Integer victorias, @RequestParam Integer derrotas,@RequestParam Integer empates,@RequestParam Integer totalPartidas,Model model) {

		Player player = new Player(label,name,apellido1,apellido2,email,pass,idpartida,victorias,derrotas,empates,totalPartidas);

		repositorioPlayer.save(player);

		return "AddPlayer";//Nombre del XHTML que rellene los datos del jugador.
	}
    
    
}
