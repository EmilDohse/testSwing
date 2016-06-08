package com.blobs.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import com.blobs.MVC;

public class JGameOverPanel extends JComponent implements MouseListener {
	public JGameOverPanel() {
		
		JButton startButton = new JButton();
		startButton.setText("Start Again");
		startButton.setBounds(300, 400, 500, 100);
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
