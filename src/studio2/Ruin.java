package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int startingAmount = 10; 
	int ruin = 0;
	int success = 20;
	double winChance = 0.5;
	int simulation = 0;
	
	while(startingAmount != ruin && startingAmount != success) {
		double rand = Math.random()*2 + 0;
		if (rand > winChance) {
			simulation ++;
			System.out.println("Simulation " + simulation + ": " + startingAmount++ + " " + "Win");
		}
		else {
			simulation ++;
			System.out.println("Simulation " + simulation + ": " + startingAmount-- + " " + "Lose"); 
		}
	}
	System.out.println("Game over");
  }
}
