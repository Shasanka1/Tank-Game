import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;
import javax.xml.stream.Location;

public class Tank2 extends JPanel implements Drawable{

	private int hp;
	private static int y_value;
	private static int x_value;
	private int w = 70;
	private int h = 35;
	


	public Tank2(int x1, int y1, int health) {
		// TODO Auto-generated constructor stub
		hp = health;
		x_value = x1;
		y_value = y1;
	}
	

	@Override
	public void draw(Graphics g) {
		
		super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        AffineTransform old = g2d.getTransform();
        g2d.setColor(Color.CYAN);
        
        g2d.rotate(Math.toRadians(30));
        
        
        g2d.fillRoundRect(x_value, y_value, w, h, 20, 10);
        
        
        g2d.setTransform(old);
        
        //things you draw after here will not be rotated
		
		
		
	}

}
