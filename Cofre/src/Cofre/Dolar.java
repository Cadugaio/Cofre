package Cofre;

public class Dolar extends Moeda {
	
	double Moeda;
	
public Dolar(double cotaD, double cotaE, double cotaR) {
	super(cotaD, cotaE, cotaR);
	this.cotaD = cotaD;
}
	
		double calculaValor() {
			double totalD = 4.93*cotaR;
			return totalD;
	}

}
