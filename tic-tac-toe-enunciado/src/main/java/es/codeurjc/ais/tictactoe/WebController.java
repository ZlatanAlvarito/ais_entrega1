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
        
        Partidas partida5 = new Partidas();
        repositoroPartidas.save(partida5);
        
        Partidas partida6 = new Partidas();
        repositoroPartidas.save(partida6);
        
        Player play1 = new Player("Alo845", "Alvaro", "Lopez", "Rodriguez", "alo@gmail.com","0101",partida1.getIdPartida(),2,0,0,2);       
        repositorioPlayer.save(play1);
        
        Player play2 = new Player("DaniMax", "Daniel", "Torero", "Ochoa", "danii@gmail.com","0202",partida1.getIdPartida(),0,0,2,2); 
        repositorioPlayer.save(play2);   
        
        Player play3 = new Player("pepe5", "Gerad", "Sistín", "Rodriguez", "pepe@gmail.com","0303",partida2.getIdPartida(),1,0,1,2);      
        repositorioPlayer.save(play3);
        
        Player play4 = new Player("peterPen", "Saul", "Espain", "Gusta", "saul@gmail.com","0404",partida2.getIdPartida(),0,1,1,2);
        repositorioPlayer.save(play4); 
        
        Player play5 = new Player("laury", "Laura", "Millar", "Riez", "Laura@gmail.com","0505",partida3.getIdPartida(),0,0,2,2);
        repositorioPlayer.save(play5); 
        
        Player play6 = new Player("carl4", "Carlos", "Perez", "Campos", "carlitos4@gmail.com","0606",partida3.getIdPartida(),0,0,2,2);
        repositorioPlayer.save(play6); 
        
        Player play7 = new Player("jueanito", "Juan", "Sanchez", "Pasamontes", "juan@gmail.com","0707",partida4.getIdPartida(),0,2,0,2);
        repositorioPlayer.save(play7); 
        
        Player play8 = new Player("napoleon", "Andrea", "Moral", "Gutierrez", "andreita@gmail.com","0808",partida4.getIdPartida(),2,0,0,2);
        repositorioPlayer.save(play8); 
        
        Player play9 = new Player("sergy", "Sergio", "Morillas", "Osma", "serg@gmail.com","0909",partida5.getIdPartida(),0,1,1,2);
        repositorioPlayer.save(play9); 
        
        Player play10 = new Player("vegetta777", "Guillermo", "Sanz", "Guzman", "guilleVEG@gmail.com","1010",partida5.getIdPartida(),0,1,1,2);
        repositorioPlayer.save(play10); 
        
        Player play11 = new Player("valerian", "Valeria", "Lora", "García", "valeria@gmail.com","1111",partida6.getIdPartida(),0,0,2,2);
        repositorioPlayer.save(play11); 
        
        Player play12 = new Player("al003", "Almudena", "Cordoba", "Muñoz", "almu@gmail.com","1212",partida6.getIdPartida(),0,0,2,2);
        repositorioPlayer.save(play12);
        

    }   

    @RequestMapping("/")
    public String greetingInicio(Model model) {       

        model.addAttribute("jugadores", repositorioPlayer.findAll());

        model.addAttribute("partidas", repositoroPartidas.findAll());

        return "index";
    }

}
