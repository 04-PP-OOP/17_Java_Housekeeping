package com.cc.java;

public class Level_1 extends Level_2{

	private int points = 100;
	
	public void play() {
		if (LevelManager.isPlayerInLevel_1()) {
			System.out.println("Hi, Level 1 here and I have " + this.points + " points.");
		} else {
			super.play();
		}
		
	}
	
	
	
}
