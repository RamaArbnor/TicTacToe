package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import setup.*;

//import setup.Manager;
//import setup.Window;

public class TicTacToeMain implements Manager {

	public static int WIDTH = 630, HEIGHT = 630, FPS = 15, TPS = 60;
	static Field field = new Field();
	static int markWidth = 200;
	static int markHeight = 200;
	
	static int round = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		Window wind = new Window(WIDTH, HEIGHT, FPS, TPS, "Tic Tac Toe", new TicTacToeMain());
		
	}


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		field.draw(g);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				field.fieldMark[i][j].x = j;
				field.fieldMark[i][j].y = i;
				field.fieldMark[i][j].draw(g);
				checkWin();
				
			}
		}
		
	}


	@Override
	public void tick() {
		// TODO Auto-generated method stub
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				
//				if(field.fieldMark[i][j].state == field.fieldMark[i][j + 1].state && field.fieldMark[i][j].state == field.fieldMark[i][j + 2].state && field.fieldMark[i][j].state != 0 ) {
//					if(field.fieldMark[i][j].state == 1 && field.fieldMark[i][j+1].state == 1 && field.fieldMark[i][j + 2].state == 1) {
//						System.out.println("x wins");
//						TPS = 0;
//					}else if(field.fieldMark[i][j].state == 2 && field.fieldMark[i][j+1].state == 2 && field.fieldMark[i][j + 2].state == 2) {
//						System.out.println("o wins");
//						TPS = 0;
//					}
//				}
//				
//			}
//		}
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		if (e.getX() > 0 && e.getX() < markWidth && e.getY() > 0 && e.getY() < markHeight) {
////			System.out.println(field.fieldMark[0][0].state);
//			field.fieldMark[0][0].state = 1;
//			
//		}
//		x = 0
		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				
//				if(field.fieldMark[i][j].state == field.fieldMark[i][j + 1].state && field.fieldMark[i][j].state == field.fieldMark[i][j + 2].state && field.fieldMark[i][j].state != 0 ) {
//					if(field.fieldMark[i][j].state == 1 && field.fieldMark[i][j+1].state == 1 && field.fieldMark[i][j + 2].state == 1) {
//						System.out.println("x wins horizantaly");
//					}else if(field.fieldMark[i][j].state == 2 && field.fieldMark[i][j+1].state == 2 && field.fieldMark[i][j + 2].state == 2) {
//						System.out.println("o wins horizantaly");
//					}
//				}else if (field.fieldMark[i][j].state == field.fieldMark[i + 1][j].state && field.fieldMark[i][j].state == field.fieldMark[i + 2][j].state && field.fieldMark[i][j].state != 0 ){
//					if(field.fieldMark[i][j].state == 1 && field.fieldMark[i+1][j].state == 1 && field.fieldMark[i+2][j].state == 1) {
//						System.out.println("x wins vertically ");
//					}else if(field.fieldMark[i][j].state == 2 && field.fieldMark[i+1][j].state == 2 && field.fieldMark[i+2][j ].state == 2) {
//						System.out.println("o wins vertically");
//					}
//				}else if (field.fieldMark[i][j + 2].state == field.fieldMark[i + 1][j + 1].state && field.fieldMark[i][j+2].state == field.fieldMark[i + 2][j ].state && field.fieldMark[i][j + 2].state != 0 ){
//					if(field.fieldMark[i][j+2].state == 1 && field.fieldMark[i+1][j+1].state == 1 && field.fieldMark[i+2][j].state == 1) {
//						System.out.println("x wins diagonally top right");
//					}else if(field.fieldMark[i][j+2].state == 2 && field.fieldMark[i+1][j+1].state == 2 && field.fieldMark[i+2][j].state == 2) {
//						System.out.println("o wins diagonally top right");
//					}
//				}else if (field.fieldMark[i][j].state == field.fieldMark[i + 1][j + 1].state && field.fieldMark[i][j].state == field.fieldMark[i + 2][j+2 ].state && field.fieldMark[i][j ].state != 0 ){
//					if(field.fieldMark[i][j].state == 1 && field.fieldMark[i+1][j+1].state == 1 && field.fieldMark[i+2][j+2].state == 1) {
//						System.out.println("x wins diagonally top left");
//					}else if(field.fieldMark[i][j].state == 2 && field.fieldMark[i+1][j+1].state == 2 && field.fieldMark[i+2][j+2].state == 2) {
//						System.out.println("o wins diagonally top left");
//					}
//				}
//				
//			}
//		}
		
		int mx = e.getX();
		int my = e.getY();

		if (my < markHeight) {

//			y = 0
			if (mx < markWidth) {
				if(round % 2 != 0) {
					if(field.fieldMark[0][0].state == 0) {
						field.fieldMark[0][0].state = 1;
						round++;
					}
				}else if(round % 2 == 0){
					if(field.fieldMark[0][0].state == 0) {
						field.fieldMark[0][0].state = 2;
						round++;
					}
				}
//			y = 1
			}else if(mx > markWidth && mx < markWidth*2) {
				if(round % 2 != 0) {
					if(field.fieldMark[0][1].state == 0) {
						field.fieldMark[0][1].state = 1;
						round++;
					}
				}else if(round % 2 == 0){
					if(field.fieldMark[0][1].state == 0) {
						field.fieldMark[0][1].state = 2;
						round++;
					}

				}
//			y = 2
			}else if(mx > markWidth*2 && mx < markWidth*3) {
				if(round % 2 != 0) {
					if(field.fieldMark[0][2].state == 0) {
						field.fieldMark[0][2].state = 1;
						round++;	
					}

				}else if(round % 2 == 0){
					if(field.fieldMark[0][2].state == 0) {
						field.fieldMark[0][2].state = 2;
						round++;
					}
				}
			}
		}
//			----------------------------------------------------------
		if (my > markHeight && my < markHeight*2) {
//				System.out.println("hello");
//				y = 0
				if (mx < markWidth) {
					if(round % 2 != 0) {
						if(field.fieldMark[1][0].state == 0) {
							field.fieldMark[1][0].state = 1;
							round++;
						}
					}else if(round % 2 == 0){
						if(field.fieldMark[1][0].state == 0) {
							field.fieldMark[1][0].state = 2;
							round++;
						}
					}
//				y = 1
				}else if(mx > markWidth && mx < markWidth*2) {
					if(round % 2 != 0) {
						if(field.fieldMark[1][1].state == 0) {
							field.fieldMark[1][1].state = 1;
							round++;
						}
					}else if(round % 2 == 0){
						if(field.fieldMark[1][1].state == 0) {
							field.fieldMark[1][1].state = 2;
							round++;
						}

					}
//				y = 2
				}else if(mx > markWidth*2 && mx < markWidth*3) {
					if(round % 2 != 0) {
						if(field.fieldMark[1][2].state == 0) {
							field.fieldMark[1][2].state = 1;
							round++;	
						}

					}else if(round % 2 == 0){
						if(field.fieldMark[1][2].state == 0) {
							field.fieldMark[1][2].state = 2;
							round++;
						}
					}
				}
				
			
			}
//		----------------------------------------------------------
	if (my > markHeight*2) {
			System.out.println("hello");
//			y = 0
			if (mx < markWidth) {
				if(round % 2 != 0) {
					if(field.fieldMark[2][0].state == 0) {
						field.fieldMark[2][0].state = 1;
						round++;
					}
				}else if(round % 2 == 0){
					if(field.fieldMark[2][0].state == 0) {
						field.fieldMark[2][0].state = 2;
						round++;
					}
				}
//			y = 1
			}else if(mx > markWidth && mx < markWidth*2) {
				if(round % 2 != 0) {
					if(field.fieldMark[2][1].state == 0) {
						field.fieldMark[2][1].state = 1;
						round++;
					}
				}else if(round % 2 == 0){
					if(field.fieldMark[2][1].state == 0) {
						field.fieldMark[2][1].state = 2;
						round++;
					}

				}
//			y = 2
			}else if(mx > markWidth*2 && mx < markWidth*3) {
				if(round % 2 != 0) {
					if(field.fieldMark[2][2].state == 0) {
						field.fieldMark[2][2].state = 1;
						round++;	
					}

				}else if(round % 2 == 0){
					if(field.fieldMark[2][2].state == 0) {
						field.fieldMark[2][2].state = 2;
						round++;
					}
				}
			}
			
		
		}
		
		
	
			
			
		
		
	}

	public void checkWin() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				if(field.fieldMark[i][j].state == field.fieldMark[i][j + 1].state && field.fieldMark[i][j].state == field.fieldMark[i][j + 2].state && field.fieldMark[i][j].state != 0 ) {
					if(field.fieldMark[i][j].state == 1 && field.fieldMark[i][j+1].state == 1 && field.fieldMark[i][j + 2].state == 1) {
						System.out.println("x wins horizantaly");
						
					}else if(field.fieldMark[i][j].state == 2 && field.fieldMark[i][j+1].state == 2 && field.fieldMark[i][j + 2].state == 2) {
						System.out.println("o wins horizantaly");
					}
				}else if (field.fieldMark[i][j].state == field.fieldMark[i + 1][j].state && field.fieldMark[i][j].state == field.fieldMark[i + 2][j].state && field.fieldMark[i][j].state != 0 ){
					if(field.fieldMark[i][j].state == 1 && field.fieldMark[i+1][j].state == 1 && field.fieldMark[i+2][j].state == 1) {
						System.out.println("x wins vertically ");
					}else if(field.fieldMark[i][j].state == 2 && field.fieldMark[i+1][j].state == 2 && field.fieldMark[i+2][j ].state == 2) {
						System.out.println("o wins vertically");
					}
				}else if (field.fieldMark[i][j + 2].state == field.fieldMark[i + 1][j + 1].state && field.fieldMark[i][j+2].state == field.fieldMark[i + 2][j ].state && field.fieldMark[i][j + 2].state != 0 ){
					if(field.fieldMark[i][j+2].state == 1 && field.fieldMark[i+1][j+1].state == 1 && field.fieldMark[i+2][j].state == 1) {
						System.out.println("x wins diagonally top right");
					}else if(field.fieldMark[i][j+2].state == 2 && field.fieldMark[i+1][j+1].state == 2 && field.fieldMark[i+2][j].state == 2) {
						System.out.println("o wins diagonally top right");
					}
				}else if (field.fieldMark[i][j].state == field.fieldMark[i + 1][j + 1].state && field.fieldMark[i][j].state == field.fieldMark[i + 2][j+2 ].state && field.fieldMark[i][j ].state != 0 ){
					if(field.fieldMark[i][j].state == 1 && field.fieldMark[i+1][j+1].state == 1 && field.fieldMark[i+2][j+2].state == 1) {
						System.out.println("x wins diagonally top left");
					}else if(field.fieldMark[i][j].state == 2 && field.fieldMark[i+1][j+1].state == 2 && field.fieldMark[i+2][j+2].state == 2) {
						System.out.println("o wins diagonally top left");
					}
				}
				
			}
		}
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


	@Override
	public void keyPressed(int e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(int e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(int e) {
		// TODO Auto-generated method stub
		
	}

}
