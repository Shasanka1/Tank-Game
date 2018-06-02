import java.awt.Color;

import java.awt.Graphics;
import java.util.Collection;

import javax.swing.JPanel;

public class Terrain implements Drawable {
	private int[] heights;
	Color damage;
	private JPanel panel;
	private int diff_h;
	private int w;
	private int h;
	
	
	public Terrain(int width, int height) {
		w = width;
		h = height;
		heights = new int[w];
		h = 500;
		for(int i = 0; i<w/2;i++){
			diff_h = (int)(Math.random()*2);
			heights[i] = h+diff_h;
			h=h-diff_h;
		}
		for(int e = w/2;e<w;e++){
			diff_h = (int)(Math.random()*2);
			heights[e]=h+diff_h;
			h=h+diff_h;
		}
	}
	
	public int getheights(){
		return 450;	
	}

	public void terrain_Damage(){
		
	}
	
	@Override
	public void draw(Graphics g) {
		int curr_num=289;
		int half= w/2;
		g.setColor(new Color(20, 190, 58));
		
		for(int i=0; i<w/2;i++){
			g.drawLine(i, heights[i], i, 600);
		}
		for(int z =w/2; z<w;z++){
			g.drawLine(z, heights[z], z, 600);
			
		}
	}

}


