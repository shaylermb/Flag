import java.awt.Graphics;
import java.awt.Color;
public class Rectangle {
	private Point toppoint;
	private int length;
	private int height;
	private Color color;
	

	public Rectangle(Point toppoint, int length, int height, Color color, double scale){
		this.length = (int)(length * scale);
		this.height = (int)(height * scale);
		this.color = color;
		this.toppoint = toppoint;
	}
	
	public void paint(Graphics g){
		g.setColor(this.color);
		g.fillRect(this.toppoint.getX(), this.toppoint.getY(), this.length, this.height);
	}

}