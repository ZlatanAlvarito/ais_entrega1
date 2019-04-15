/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.codeurjc.ais.tictactoe;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ALVARO
 */
@Controller
public class WebController {

    @Autowired
    private PlayerRepository repositorioPlayer;
    @Autowired
    private PartidasRepository repositoroPartidas;

    @PostConstruct
    public void init() {

        Partidas partida1 = new Partidas();
        repositoroPartidas.save(partida1);
        
        Partidas partida2 = new Partidas();
        repositoroPartidas.save(partida2);
        
        Partidas partida3 = new Partidas();
        repositoroPartidas.save(partida3);
        
        Partidas partida4 = new Partidas();
        repositoroPartidas.save(partida4);
        
        //Player play1 = new Player("Toni845", "Antonio", "Garcia", "Lozano", "antoni@gmail.com","0000",partida1,2,0,0,2);
        Player play1 = new Player (1,"Toni845", "Antonio");
        repositorioPlayer.save(play1);
        
        /*Player play2 = new Player("DaniMax", "Daniel", "Torero", "Ochoa", "danii@gmail.com","1111",partida1,0,0,2,2);
        repositorioPlayer.save(play2);    */   

    }   

    @RequestMapping("/")
    public String greetingInicio(Model model) {       

        model.addAttribute("jugadores", repositorioPlayer.findAll());

        model.addAttribute("partidas", repositoroPartidas.findAll());

        return "index";
    }

}
