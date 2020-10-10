package sa;

import java.util.Random;

public class SimulatedAnnealing {
	
	private Random randomGenerator;
	private double currentCoordinateX;
	private double nextCoordinateX;
	private double bestCoordinateX;
	
	public void findOptimum() {
		double temperature = Constants.MAX_TEMPERATURE;
		
		while( temperature > Constants.MIN_TEMPERATURE ) {
			
			nextCoordinateX = getRamdomX();
			
		}
	}
	
	private double getRamdomX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public SimulatedAnnealing() {
		this.randomGenerator = new Random();
	}
	
	
	public double getEnergy(double x) {
		return f(x);
	}
	
	public double f(double x) {
		return (x-0.3)*(x-0.3)*(x-0.3)-5*x+x*x-2;
	}
	
	public double acceptanceProbability(double energy, double newEnergy, double temperature) {
		if( newEnergy < energy ) {
			return 1;
		}
		return Math.exp((energy-newEnergy)/temperature);
	}

}
