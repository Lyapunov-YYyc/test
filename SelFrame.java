import java.awt.*;
import java.awt.event.*;

public class SelFrame extends Frame{
	public SelFrame(){
		this.setTitle("Sel");
		this.setLocation(500,300);
		this.setSize(300,200);
		
		//this.addWindowListener(new MainWinListener(Selframe));
		SelWinListener lo = new SelWinListener(this);
		this.addWindowListener(lo);
		this.setVisible(true);
	}
    public class SelWinListener extends WindowAdapter{
	private Frame f;
	public SelWinListener (Frame f){
		this.f = f;
	}
	public void windowClosing(WindowEvent e){
			f.dispose();
	}
  }
}