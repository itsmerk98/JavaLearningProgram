import java.awt.*;
import java.applet.*;

public class Test extends Applet{
	TextField text1, text2;
	public void init(){
		text1 = new TextField(8);
		text2 = new TextField(8);
		add(text1);
		add(text2);
	}
	public void paint(Graphics g){
		int x = 0, y = 0, z = 0;
		String S1, S2, S3;
		g.drawString("Input no.s in each box ",10,50);
		try{
			S1 = text1.getText();
			x = Integer.parseInt(S1);
			S2 = text2.getText();
			y = Integer.parseInt(S2);
		}
		catch(Exception ex){
			z = x+y;
			S3 = String.valueOf(z);
			g.drawString("Sum : ",10, 75);
			g.drawString(S3, 100, 75);
		}
	}
	public boolean action(Event event, Object object){
		repaint( );
		return true;
	}
}