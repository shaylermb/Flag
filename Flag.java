import java.awt.*;
import java.applet.*;

public class Flag extends Applet {
	
	private AmericanFlag flag;

	public void init() {
		flag = new AmericanFlag(100, 50, 2.0);
	}

	public void paint(Graphics g) {
		flag.draw(g);
	}

}