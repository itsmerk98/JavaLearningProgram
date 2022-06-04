package selfTest;
import java.applet.*;
import java.awt.*;


public class Test extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawString("Hello, welcome to applets ", 200, 500);
	}
}