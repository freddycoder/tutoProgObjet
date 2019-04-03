package Lib;

import java.util.Random;

public class QuestionAddition implements IQuestion {

	static Random _randEngine = new Random();
	
	private double x;
	private double y;
	
	public QuestionAddition() {
		x = _randEngine.nextInt(12) + 1;
		y = _randEngine.nextInt(12) + 1;
	}
	
	@Override
	public boolean Verifier(double guess) {
		return (x + y) == guess;
	}

	@Override
	public String toString() {
		return x + " + " + y + " = ";
	}
}
