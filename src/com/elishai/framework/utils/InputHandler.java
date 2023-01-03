package com.elishai.framework.utils;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.elishai.game.state.State;

public class InputHandler implements KeyListener, MouseListener {
	
	private State currentState;
	
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		currentState.onCLick(e);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		currentState.onKeyPress(e);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentState.onKeyRelease(e);
	}

}
