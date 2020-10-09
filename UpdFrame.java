import java.awt.*;
import java.awt.event.*;

public class UpdFrame extends Frame{
	public UpdFrame(){
		this.setTitle("Upd");
		this.setLocation(500,300);
		this.setSize(300,200);
		
		UpdWinListener lo = new UpdWinListener(this);
		this.addWindowListener(lo);
		
		this.setVisible(true);
	}
    public class UpdWinListener extends WindowAdapter{
	private Frame f;
	public UpdWinListener (Frame f){
		this.f = f;
	}
	public void windowClosing(WindowEvent e){
			f.dispose();
	}
  }
}