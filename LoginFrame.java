import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends Frame{
	TextField tun , tpw;
	Label lun , lpw;
	Button blogin , breset;
    public LoginFrame(){
		this.setLocation(500,300);
		this.setSize(300,200);
		this.setLayout(null);
		
		tun = new TextField();
		tun.setLocation(150,60);
		tun.setSize(100,20);
		
		tpw = new TextField();
		tpw.setLocation(150,100);
		tpw.setSize(100,20);
		tpw.setEchoChar('*');
		
		lun = new Label("username:");
		lun.setLocation(50,60);
		lun.setSize(70,20);
		
		lpw = new Label("password:");
		lpw.setLocation(50,100);
		lpw.setSize(70,20);
		
		blogin = new Button("Login");
		blogin.setLocation(50,150);
		blogin.setSize(70,20);
		
		breset = new Button("Reset");
		breset.setLocation(170,150);
		breset.setSize(70,20);
		
		//ActionListener
		LoginActionListener bp = new LoginActionListener();
		blogin.addActionListener(bp);
		breset.addActionListener(bp);
		
		this.add(tun);
		this.add(tpw);
		this.add(lun);
		this.add(lpw);
		this.add(blogin);
		this.add(breset);
		
		LoginWinListener lo = new LoginWinListener();
		this.addWindowListener(lo);
		this.setVisible(true);
	}
	public class LoginActionListener implements ActionListener{
	
	  public void actionPerformed(ActionEvent e){
		Object o = e.getSource();
		Button b = null;
		String str = "";
		if(o instanceof Button){
			b = (Button)o;
			str = b.getLabel();
		}
		if("Login".equals(str)){
			String username = tun.getText();
			String password = tpw.getText();
			
			if("111".equals(username) && "123".equals(password)){
				Frame frame = new MainFrame ();
				LoginFrame.this.dispose();
			}
                else{
				tun.getText();
				tpw.getText();
				tun.setText("");
				tpw.setText("");
			}
		}
		if("Reset".equals(str)){
			tun.getText();
			tpw.getText();
			tun.setText("");
			tpw.setText("");
		}
	  }
}
    public class LoginWinListener extends WindowAdapter{
	  public void windowClosing(WindowEvent e){
			System.exit(0);
	    }
   }
}