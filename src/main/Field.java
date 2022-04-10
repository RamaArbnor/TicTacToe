package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Field {
	
//	static public Mark[][] field = new Mark[3][3];
	
//	static public ArrayList<List<Mark> > fieldMark = new ArrayList<List<Mark> >();
	static public Mark[][] fieldMark = new Mark[5][5];
	
	public Field() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				this.fieldMark[i][j] = new Mark();
			}
		}
	}
	
//	static public Mark[][] fieldMark = new Mark[3][3];
	
	
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.drawLine(200, 50, 200, 550);
		g.drawLine(400, 50, 400, 550);
		g.drawLine(50, 200, 550, 200);
		g.drawLine(50, 400, 550, 400);
	}
	
	public void tick() {
		
	}
	
}


