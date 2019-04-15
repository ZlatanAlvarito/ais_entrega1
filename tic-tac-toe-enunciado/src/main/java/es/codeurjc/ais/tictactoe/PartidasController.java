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
public class PartidasController {
    @Autowired
	private PartidasRepository repositorioPartidas;
    @PostMapping("/añadir/partida")
	public String añadirPartida(@RequestParam long idPartida,
			Model model) {

		Partidas partida = new Partidas(idPartida);

		repositorioPartidas.save(partida);

		return "añadirPartida";//Nombre del XHTML que rellene los datos de la partida.
	}
    
    
    
}
