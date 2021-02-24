package com.cc.java;

public class Level_0 extends Level_1{

	private int points = 10;
	
	public void play() {
		if (LevelManager.isPlayerInLevel_0()) {
			System.out.println("Hi, Level 0 here and I have " + this.points + " points.");
		} else {
			super.play();
		}
	}
	
	
	
}
