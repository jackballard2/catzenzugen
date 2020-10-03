import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		
		//Draw the body of the cat
		g2.setColor(Color.white);
		g2.fillRect(125, 125, 200, 100);
		g2.setColor(Color.red);
		g2.fillRect(125, 125, 50, 100);
		g2.fillRect(125+100, 125, 50, 100);
		
		
		//draw the legs and claws
		g2.setColor(Color.black);
		g2.fillRect(125, 125+100, 50, 75);
		g2.fillRect(125+150, 125+100, 50, 75);
		g2.setColor(Color.white);
		g2.fillRect(125+150+5, 125+100+65, 10, 10);
		g2.fillRect(125+5, 125+100+65, 10, 10);
		g2.fillRect(125+150+5+15, 125+100+65, 10, 10);
		g2.fillRect(125+5+15, 125+100+65, 10, 10);
		g2.fillRect(125+150+5+15+15, 125+100+65, 10, 10);
		g2.fillRect(125+5+15+15, 125+100+65, 10, 10);
		
		//draw the cat something i stole form online
		g2.setColor(Color.red);
		g2.fillRect(30,30,500,20);
		g2.setColor(Color.cyan);
		g2.drawString("I could put a lot of my political opions in this but instead im just going to make it really long", 50,50);
		g2.setColor(Color.cyan);
		g2.drawString("*Cat Noises**Cat Noises**Cat Noises**Cat Noises**Cat Noises*", 250,250);
		
		
		// Draw the head
		g2.setColor(Color.black);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.green);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Meow", catX, catY+HEAD_DIMENSION+10);	
		
		
		//make tail
		g2.setColor(Color.black);
		g2.fillRect(125+175, 125-75, 25, 80);
		
		//add friend
		g2.setColor(Color.orange);
		g2.fillOval(10, 275, 25, 25);
		g2.fillRect(15, 272, 5, 5);
		g2.fillRect(25, 272, 5, 5);
		g2.setColor(Color.green);
		g2.fillOval(15, 281, 5,5);
		g2.fillOval(25, 281, 5, 5);
	}
}
