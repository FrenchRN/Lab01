package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Parole {
	private ArrayList<String> elenco;
	public Parole() {
		//TODO
		elenco =new ArrayList<String>();
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
	
	public void cancella(String c) {
		for(String s:elenco) {
			if(s.equals(c)) elenco.remove(elenco.indexOf(c));
		}
	}

}
