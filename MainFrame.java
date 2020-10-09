import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{
	Button bsel , bins , bdel , bupd;
	public MainFrame(){
		this.setLocation(500,300);
		this.setSize(350,250);
		this.setLayout(null);
		
		bsel = new Button("sel");
		bsel.setLocation(50,50);
		bsel.setSize(110,50);
		
		bins = new Button("ins");
		bins.setLocation(200,50);
		bins.setSize(110,50);
		
		bupd = new Button("upd");
		bupd.setLocation(50,150);
		bupd.setSize(110,50);
		
		bdel = new Button("del");
		bdel.setLocation(200,150);
		bdel.setSize(110,50);
		
		
		bsel.addActionListener(new MainActionListener());
		bins.addActionListener(new MainActionListener());
		bupd.addActionListener(new MainActionListener());
		bdel.addActionListener(new MainActionListener());
		
		this.add(bdel);
		this.add(bins);
		this.add(bsel);
		this.add(bupd);
		
		this.addWindowListener(new MainWinListener());
		this.setVisible(true);

	}
    public class MainActionListener implements ActionListener{

	public MainActionListener(){
	}

	public void actionPerformed(ActionEvent e){
		Object o = e.getSource();
		Button b = null;
		String str = "";
		if(o instanceof Button){
			b = (Button)o;
			str = b.getLabel();
		}
		if("sel".equals(str)){
			new SelFrame();
		}
		if("upd".equals(str)){
			new UpdFrame();
		}
		if("del".equals(str)){
			new DelFrame();
		}
		if("ins".equals(str)){
			new InsFrame();
		}
	}
}
    public class MainWinListener extends WindowAdapter{
	  public void windowClosing(WindowEvent e){
			System.exit(0);
	  }
  }
}