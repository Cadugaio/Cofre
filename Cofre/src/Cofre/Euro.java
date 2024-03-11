package Cofre;

public class Euro extends Moeda {
	
	double Moeda;
	
public Euro(double cotaE, double cotaD, double cotaR) {
	super(cotaE, cotaD, cotaR);
	this.cotaE = cotaE;
}
	
		double calculaValor() {
			double totalE = 5.40*cotaR;
			return totalE;
	}

}
