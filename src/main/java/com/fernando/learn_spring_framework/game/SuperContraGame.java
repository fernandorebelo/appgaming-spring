package com.fernando.learn_spring_framework.game;

public class SuperContraGame implements GameConsole{

	@Override
	public void up() {
		System.out.println("Up");
		
	}

	@Override
	public void down() {
		System.out.println("Sit down");
		
	}

	@Override
	public void left() {
		System.out.println("Go back");
		
	}

	@Override
	public void right() {
		System.out.println("Shoot a bullet");
		
	}

}
