package com.fernando.learn_spring_framework;

import com.fernando.learn_spring_framework.game.GameRunner;
import com.fernando.learn_spring_framework.game.MarioGame;
import com.fernando.learn_spring_framework.game.PacManGame;
import com.fernando.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();
		
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}

}
