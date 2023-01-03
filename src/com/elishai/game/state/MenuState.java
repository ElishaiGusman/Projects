package com.elishai.game.state;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.elishai.game.main.Resources;

public class MenuState extends State {

	@Override
	public void init() {
		System.out.println("Entered MenuState");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Resources.welcome, 0, 0, null);		
	}

	@Override
	public void onCLick(MouseEvent e) {
		System.out.println("Clicked!");
		
	}

	@Override
	public void onKeyPress(KeyEvent e) {
		System.out.println("Key pressed!");
		
	}

	@Override
	public void onKeyRelease(KeyEvent e) {
		System.out.println("Key released!");
		
	}

}
