package main;

import java.awt.Color;
import java.awt.Graphics;

public class Mark {
	
	public int x;
	public int y;
	
//	0 = null, 1 = X, 2 = O;
	public int state = 0; 
	
	public void draw(Graphics g) {
		if(state == 1) {
			drawX(g);
		}else if (state == 2) {
			drawO(g);
		}else {
//			System.out.println(state);
		}
	}
	
	public void drawX(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((100 + 200*x)-15, (100 + 200*y)-15, 30, 30);
	}
	
	public void drawO(Graphics g) {
		g.setColor(Color.green);
		g.fillRect((100 + 200*x)-15, (100 + 200*y)-15, 30, 30);
	}
	
}
