package Cofre;

import java.util.ArrayList;
import java.util.Scanner;

	public class Principal {
		public static void main(String[]args) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Menu");
			System.out.println("1 - ");
			System.out.println("2 - ");
			System.out.println("3 - ");
			System.out.println("4 - ");

			
			Dolar cotaD = new Dolar(1.0, 1.00, 1.00);
			Euro cotaE = new Euro(1.0, 1.00, 1.00);
			Real cotaR = new Real(1.0, 1.00, 1.00);
			
			Moeda cota;
			
			cota = cotaD;
			System.out.println("Dolar: " + cota.calculaValor());
			cota = cotaE;
			System.out.println("Euro: " + cota.calculaValor());
			cota = cotaR;
			System.out.println("Real: " + cota.calculaValor());
			
			
			ArrayList<Moeda> listaMoedas = new ArrayList<>();
			listaMoedas.add(cotaD);
			listaMoedas.add(cotaE);
			listaMoedas.add(cotaR);
			listaMoedas.add(new Dolar(1.0, 1.00, 1.00));
			listaMoedas.add(new Euro(1.0, 1.00, 1.00));
			listaMoedas.add(new Real(1.0, 1.00, 1.00));
		
			

		
		
	double total = 0;
			
	for(Moeda t : listaMoedas) {
		total += t.calculaValor();
	
	System.out.println("Total de moedas: " + total);

	}}}
	
