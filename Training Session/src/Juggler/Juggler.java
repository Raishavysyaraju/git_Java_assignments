package Juggler;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;


public class Juggler extends Frame  {
	
	private TextField First_Number;
	private TextField Second_Number;
	private TextField Third_Number;
		
	public Juggler(boolean visible,String Title,int x,int y,int width,int height) {
		this.setVisible(visible);
		this.setTitle(Title);
		this.setBounds(x, y, width, height);
		this.setLayout(null);
		
		
	this.addWindowListener(new JMasterHandler());
			
		//Text fields creation on frame
		
	 First_Number =new TextField();
	First_Number.setBounds(100, 60, 80, 20);
	add(First_Number);
	
	 Second_Number =new TextField();
	Second_Number.setBounds(190, 60, 80, 20);
	add(Second_Number);
	
	 Third_Number =new TextField();
	Third_Number.setBounds(280, 60, 80, 20);
	add(Third_Number);
			
	
	Button Clockwise = new Button("Clockwise");
	this.add(Clockwise);
	Clockwise.setBounds(140, 130, 80, 30);
	Clockwise.addActionListener(new JMasterHandler(First_Number,Second_Number,Third_Number));
	
	//Clockwise.addActionListener(new MasterHandler(First_Number,Second_Number,Third_Number)); 
		
	Button AntiClockwise = new Button("AntiClock");
	this.add(AntiClockwise);
	AntiClockwise.setBounds(240, 130, 80, 30);
	AntiClockwise.addActionListener(new JMasterHandler(First_Number,Second_Number,Third_Number));
	
	/*TextField Third_Number =new TextField();
	Third_Number.setBounds(190, 40, 80, 20);
	add(Third_Number);*/
	
	}

	
}
