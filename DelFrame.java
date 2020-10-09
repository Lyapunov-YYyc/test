import java.awt.*;
import java.awt.event.*;

public class DelFrame extends Frame{
	public DelFrame(){
		this.setTitle("Del");
		this.setLocation(500,300);
		this.setSize(300,200);
		
		DelWinListener lo = new DelWinListener(this);
		this.addWindowListener(lo);
		
		this.setVisible(true);
	}
    public class DelWinListener extends WindowAdapter{
	private Frame f;
	public DelWinListener (Frame f){
		this.f = f;
	}
	public void windowClosing(WindowEvent e){
			f.dispose();
	}
  }
}