package com.fernando.learn_spring_framework.game;

public class GameRunner {
	
	private GameConsole game;
	
	public GameRunner(GameConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + this.game);
		this.game.up();
		this.game.down();
		this.game.left();
		this.game.right();
		
	}

}
