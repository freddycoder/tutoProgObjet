package Main;

import java.util.Scanner;

import Lib.IQuestion;
import Lib.QuestionFactory;

public class Program {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int nbBonneReponse = 0;
		int nbQuestion = 0;
		
		try {
			while (true) {
				IQuestion q = QuestionFactory.getRandomQuestion();
				
				System.out.print(q.toString());
				
				if (q.Verifier(input.nextDouble())) {
					nbBonneReponse++;
				}
				
				nbQuestion++;
			}
		}
		catch (Exception e) {
			System.out.println(nbBonneReponse + " / " + nbQuestion);
			System.out.println("Le pourcentage de bonne réponse est : " + ((double)nbBonneReponse / nbQuestion)*100);
		}
	}
}
