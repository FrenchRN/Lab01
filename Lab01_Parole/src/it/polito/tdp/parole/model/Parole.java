package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	private LinkedList<String> elenco;
	public Parole() {
		//TODO
		elenco =new LinkedList<String>();
	} 
	
	public void addParola(String p) {
		//TODO
		elenco.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(this.elenco);
		return elenco;
	}
	
	public void reset() {
		// TODO
		elenco.removeAll(this.elenco);
	}

}
