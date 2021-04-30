package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Candidato> lista = new ArrayList<>();
		lista.add(new Candidato(80, 27, true));
		lista.add(new Candidato(80, 28, true));
		lista.add(new Candidato(90, 20, true));
		lista.add(new Candidato(90, 27, false));
		lista.add(new Candidato(90, 37, false));
		lista.add(new Candidato(80, 37, false));
		lista.add(new Candidato(80, 27, false));

		Collections.sort(lista);
		
		for(Candidato c: lista) {
			System.out.println(c);
		}
		
	}
	
}
