import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.*;



public class GridBasedGameDriver {

	private JFrame frame = new JFrame("Tank Game.  Destroy your enemy");
	private JPanel panel;
	private List<Drawable> drawables= new ArrayList();
	private Terrain terrain;
	private Tank tank;
	private Tank2 tank2;
	private int x;
	private int y;
	private int x2;
	private int y2;

	public static void main(String[] args) {
		new GridBasedGameDriver().start();
		
	}

	private void start() {
		setUpGame();
		
		this.frame.setBackground(new Color(127, 127, 127));
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				drawGame(g);
			}
			
		};
		panel.setPreferredSize(new Dimension(800,600));
		frame.add(panel);
		frame.pack();
		
		
		
		panel.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"slideLeft");
		panel.getActionMap().put("slideLeft",new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		panel.requestFocusInWindow();
		//panel.addKeyListener(l);
		
		setUpObjects();
		frame.repaint();
	}

	
	private void setUpObjects() {
		x = 130;
		y = -460;
		
		x2 = 870;
		y2 = 15;
		
		terrain  = new Terrain(panel.getWidth(), panel.getHeight());
		tank = new Tank(x,y,90);
		tank2 = new Tank2(x2,y2,90);
	
		drawables.add(terrain);
		drawables.add(tank);
		drawables.add(tank2);
	}

	public void drawGame(Graphics g) {
		for(Drawable dr:drawables) {
			dr.draw(g);
		}
		panel.setBackground(new Color(55, 60, 100));
	}
	private void setUpGame() {
		

	}

	private void gameOver() {
		// TODO Auto-generated method stub

	}

}
