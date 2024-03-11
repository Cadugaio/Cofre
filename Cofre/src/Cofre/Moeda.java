package Cofre;

	abstract public class Moeda {
		
		double cotaD;
		double cotaE;
		double cotaR;
		
		
		public Moeda(double cotaD, double cotaE, double cotaR){
			super();
			this.cotaD = cotaD;
			this.cotaE = cotaE;
			this.cotaR = cotaR;
		}

	abstract double calculaValor();
	
}
