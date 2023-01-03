package com.elishai.game.main;

import javax.swing.JFrame;

public class GameMain {
	private static final String GAME_TITLE = "Game Name";
	
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 450;
	public static Game mGame;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(GAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		mGame = new Game(GAME_WIDTH, GAME_HEIGHT);
		frame.add(mGame);
		frame.pack();		
		frame.setVisible(true);
		frame.setIconImage(Resources.iconimage);
	}
}