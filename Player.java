import java.util.Random;


public class Player {
	
	public static Random rnd =  new Random();
	public String name = "";
	public int score = 0;
	public int rollhold;
	
	public double getScore() {
		return this.score;
	}
	
	public int rollDice(){
		int roll;
		//Using Random class already within Java.
		Random rand = new Random();
	
		//Dice will be 6 sided.
		roll = rand.nextInt(6) + 1;
		System.out.println("");
		System.out.println(this.name+" just rolled a "+roll+"!");
		System.out.println("");
		return roll;
	}
		
	
	public String toString() {
		return String.format("Player: %s",  name);
	}

}





