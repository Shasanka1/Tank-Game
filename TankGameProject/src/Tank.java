import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;
import javax.xml.stream.Location;

public class Tank extends JPanel implements Drawable {
	private int hp;
	private Location loc;
	
	
	private static int x ;
	private static int y ;
	private static int w = 70;
	private static int h = 35;
	
	


	public Tank(int x_value, int y_value, int health) {
		// TODO Auto-generated constructor stub
		hp = health;
		x = x_value;
		y = y_value;
		
	}
	
	@Override
	public void draw(Graphics g) {
		
		
		
		super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        
//        This is code for rotating the tank to be parallel or at best be parallel with the slope of the terrain 
        AffineTransform old = g2d.getTransform();
        g2d.setColor(Color.black);
        g2d.rotate(Math.toRadians(155));
        
        g2d.fillRoundRect(x, y, w, h, 20, 10);
        
       
        
      
        
       
        g2d.setTransform(old);
        
        //things you draw after here will not be rotated
	}
	
	@Override
    public void paintComponent(Graphics g) {
        
    }
	
}
