import java.awt.*;
import java.awt.event.*;

public class InsFrame extends Frame{
	public InsFrame(){
		this.setTitle("Ins");
		this.setLocation(500,300);
		this.setSize(300,200);
		
		InsWinListener lo = new InsWinListener(this);
		this.addWindowListener(lo);
		
		this.setVisible(true);
	}
    public class InsWinListener extends WindowAdapter{
	private Frame f;
	public InsWinListener (Frame f){
		this.f = f;
	}
	public void windowClosing(WindowEvent e){
			f.dispose();
	}
  }
}