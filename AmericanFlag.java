import java.awt.Graphics;
import java.awt.Color;
public class AmericanFlag {
	private Rectangle union;
	private Rectangle[] stripes = new Rectangle[13];
	
	


	public AmericanFlag(int length, int height, double scale){
		int stripeheight = height/13;
		this.union = new Rectangle(new Point(0,0), ((int)(height*.76*scale)),(int)((stripeheight*scale)*7), Color.blue, scale);
		for (int i = 0; i<13; i++) {
			if (i%2==0) {
				this.stripes[i] = new Rectangle(new Point(0,(int)(stripeheight*i*scale)), (int)(length*scale), (int)(stripeheight*scale), Color.red, scale);
			} else {
				this.stripes[i] = new Rectangle(new Point(0,(int)(stripeheight*i*scale)), (int)(length*scale), (int)(stripeheight*scale), Color.white, scale);
			}
		
		}

	}
	

	public void draw(Graphics g) {
		for (int i = 0; i<13; i++) {
			stripes[i].paint(g);
		}
		this.union.paint(g);

	}

	
}