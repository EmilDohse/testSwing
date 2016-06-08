package com.blobs.view;



import javax.swing.*;

import com.blobs.MVC;

import java.awt.Color;import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.MalformedURLException;

/**
 * This is where the start screen of the UI should be.
 */
public class JStartPanel extends JComponent implements MouseListener{

    /**
     * The default constructor of the class, yay!
     */
	public JStartPanel() {
		JButton startButton = new JButton();
		startButton.setText("Hallo Welt");
		startButton.setBounds(10, 10, 500, 100);
		startButton.addMouseListener(this);
		this.add(startButton);
		
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		MVC.getController().startGame();
		
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
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
