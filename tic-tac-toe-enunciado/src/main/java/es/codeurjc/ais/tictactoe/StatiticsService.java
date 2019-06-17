package es.codeurjc.ais.tictactoe;

import org.springframework.beans.factory.annotation.Autowired;

public class StatiticsService {
	
	@Autowired
    private PlayerRepository repositorioPlayer;
	
	public void actualizarVictoria(String ganador, String perdedor) {
		Player pWinner = repositorioPlayer.findByLabel(ganador);
		
		if(pWinner != null) {
			pWinner.setVictorias(pWinner.getVictorias()+1);
			pWinner.setTotalPartidas(pWinner.getTotalPartidas()+1);
			repositorioPlayer.save(pWinner);
		} else {
			pWinner = repositorioPlayer.findByName(ganador);
			if(pWinner != null) {
				pWinner.setVictorias(pWinner.getVictorias()+1);
				pWinner.setTotalPartidas(pWinner.getTotalPartidas()+1);
				repositorioPlayer.save(pWinner);
			}
		}
		
		Player pLosser = repositorioPlayer.findByLabel(perdedor);
		
		if(pLosser != null) {
			pLosser.setVictorias(pLosser.getVictorias()+1);
			pLosser.setTotalPartidas(pLosser.getTotalPartidas()+1);
			repositorioPlayer.save(pLosser);
		} else {
			pLosser = repositorioPlayer.findByName(perdedor);
			if(pLosser != null) {
				pLosser.setVictorias(pLosser.getVictorias()+1);
				pLosser.setTotalPartidas(pLosser.getTotalPartidas()+1);
				repositorioPlayer.save(pLosser);
			}
		}
	}
	
	public void actualizarEmpate(String name1, String name2) {
		Player p1 = repositorioPlayer.findByLabel(name1);
		
		if(p1 != null) {
			p1.setEmpates(p1.getEmpates()+1);
			p1.setTotalPartidas(p1.getTotalPartidas()+1);
			repositorioPlayer.save(p1);
		} else {
			p1 = repositorioPlayer.findByName(name1);
			if(p1 != null) {
				p1.setEmpates(p1.getEmpates()+1);
				p1.setTotalPartidas(p1.getTotalPartidas()+1);
				repositorioPlayer.save(p1);
			}
		}
		
		Player p2 = repositorioPlayer.findByLabel(name2);
		
		if(p2 != null) {
			p2.setEmpates(p2.getEmpates()+1);
			p2.setTotalPartidas(p2.getTotalPartidas()+1);
			repositorioPlayer.save(p2);
		} else {
			p2 = repositorioPlayer.findByName(name2);
			if(p2 != null) {
				p2.setEmpates(p2.getEmpates()+1);
				p2.setTotalPartidas(p2.getTotalPartidas()+1);
				repositorioPlayer.save(p2);
			}
		}
	}
	
}
