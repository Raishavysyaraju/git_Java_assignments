package Juggler;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class JMasterHandler implements WindowListener, ActionListener {
	private TextField first_Number;
	private TextField second_Number;
	private TextField third_Number;
	
	public JMasterHandler( TextField first_Number, TextField  second_Number,TextField third_Number){
	this.first_Number=first_Number;
	this.second_Number=second_Number;
	this.third_Number=third_Number;
	
	}
	
	public JMasterHandler() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		Juggler jframe= (Juggler)e.getSource();
		jframe.dispose();

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equalsIgnoreCase("Clockwise")) {
			try {
			int First_No= Integer.parseInt(first_Number.getText());
			//First_No=First_No++;
			//System.out.println("loop in"+First_No);
			int Z=++First_No;
			//System.out.println("after increment"+Z);
			first_Number.setText(String.valueOf(Z));
			
			int Second_No= Integer.parseInt(second_Number.getText());
			int Y=++Second_No;			
			second_Number.setText(String.valueOf(Y));
			
			
			int Third_Number= Integer.parseInt(third_Number.getText());
			third_Number.setText(String.valueOf(++Third_Number));
			
			//System.out.println("close wise Values are:"+First_No+","+Second_No+","+Third_Number);*/
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		}
		else if(e.getActionCommand().equalsIgnoreCase("AntiClock")) {
			int First_No= Integer.parseInt(first_Number.getText());
			int Z=--First_No;
			//System.out.println("after decrement"+Z);
			first_Number.setText(String.valueOf(Z));
			
			int Second_No= Integer.parseInt(second_Number.getText());
			int Y=--Second_No;			
			second_Number.setText(String.valueOf(Y));
			
			
			int Third_Number= Integer.parseInt(third_Number.getText());
			third_Number.setText(String.valueOf(--Third_Number));
		}
		
	
	}

}
