package Cofre;

public class Real extends Moeda{
	
	double Moeda;
	
public Real(double cotaR, double cotaE, double cotaD) {
	super(cotaR, cotaE, cotaD);
	this.cotaR = cotaR;
}
	
		double calculaValor() {
			double totalR = 1*cotaR;
			return totalR;
	}

}
