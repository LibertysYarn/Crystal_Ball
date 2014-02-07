package com.example.crystal.ball;

import java.util.Random;

public class CrystalBall {
	public String[] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now",
			"It is hard to say" };
	
	public String getAnAnswer() {
		
		String answer = "";
		
		//randomly select one of three answers: Yes, No, or Maybe
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		
		answer = mAnswers[randomNumber];

		return answer;
	}
}
