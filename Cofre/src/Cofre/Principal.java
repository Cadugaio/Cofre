package Cofre;

import java.util.ArrayList;

	public class Principal {
		public static void main(String[]args) {
			ArrayList<Moeda> lista = new ArrayList<Moeda>();
			
			lista.add(new Dolar("Dolar"));
			lista.add(new Euro("Euro"));
			lista.add(new Real("Real"));
		
		
	for(Moeda o : lista) {
		o.info();
	}
}}
	
