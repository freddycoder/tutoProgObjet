package Lib;

import java.util.Random;

public final class QuestionFactory {

	static Random _randEngine = new Random();
	
	private QuestionFactory() {
		// Private so it is a static class
	}
	
	public static IQuestion getRandomQuestion() {
		int index = _randEngine.nextInt(2);
		
		IQuestion q = null;
		
		if (index == 0) {
			q = new QuestionAddition();
		}
		else if (index == 1){
			q = new QuestionDivision();
		}
		
		return q;
	}
}
