package Lib;

import java.util.Random;

public class QuestionDivision implements IQuestion {

	static Random _randEngine = new Random();
	
	private double x;
	private double y;
	
	public QuestionDivision() {
		x = _randEngine.nextInt(13) + 1;
		y = _randEngine.nextInt(13) + 1;
		
		x = x * y;
	}
	
	@Override
	public boolean Verifier(double guess) {
		return (x / y) == guess;
	}
	
	public String toString() {
		return x + " / " + y + " = ";
	}
}
