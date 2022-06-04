import java.awt.*;
import java.applet.*;

class Test extends Applet {
	public void paint(Graphics g) {
		g.drawLine(200, 40, 100, 200);
		g.drawLine(200, 40, 280, 200);
		g.drawLine(200, 40, 600, 200);
		g.drawLine(600, 40, 720, 200);
		g.drawLine(280, 200, 280, 400);
		g.drawRect(100, 200, 120, 60);
		g.drawRect(400, 40, 120, 60);
		g.drawRect(140, 248, 104, 152);
	}
}