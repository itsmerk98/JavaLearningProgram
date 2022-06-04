import java.awt.*;
import java.applet.*;
public class Sample2 extends Applet {
	public void paint(Graphics g){
		int val1 = 30;
		int val2 = 20;
		int sum = val1 + val2;
		String s = "sum : " + String.valueOf(sum);
		g.drawString(s, 200, 200);
	}
}