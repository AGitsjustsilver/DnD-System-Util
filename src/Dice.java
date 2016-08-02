
public class Dice {
	
	public static int sides;
	
	public Dice(int sides){
		Dice.sides = sides;
	}
	
	public int roll(){
		int result = (int)(Math.random()*sides) + 1;
		return result;
	}
	
	public int getSides(){
		return sides;
	}
	
	
}
