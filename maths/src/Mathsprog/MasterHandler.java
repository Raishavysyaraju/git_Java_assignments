package Mathsprog;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Label;


public class MasterHandler  implements ActionListener,WindowListener {
	
	private TextField First_Number;
	private TextField Second_Number;
	private Label FinalResult;
	
	
	public MasterHandler(TextField First_Number,TextField Second_Number, Label finalResult) {
		this.setFirst_Number(First_Number);
		
		this.Second_Number=Second_Number;
		this.FinalResult=finalResult;
		
		
		//this.first_Number=First_Number;
	}

	
	public MasterHandler() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("Add")) {
			int a = Integer.parseInt(getFirst_Number().getText());
			int b = Integer.parseInt(Second_Number.getText());
			int result=a+b;
			FinalResult.setText("Answer is:"+result);
			System.out.println("A value"+a+"B value"+b);
			
			System.out.println("The result is:" +result);
		}
		else if (e.getActionCommand().equalsIgnoreCase("Substract")) {
			
			int a = Integer.parseInt(getFirst_Number().getText());
			int b = Integer.parseInt(Second_Number.getText());
			System.out.println("A value"+a+"B value"+b);
			int result=a-b;
			FinalResult.setText("Answer is:"+result);
		}
		else if (e.getActionCommand().equalsIgnoreCase("Multiply")) {
			
			int a = Integer.parseInt(getFirst_Number().getText());
			int b = Integer.parseInt(Second_Number.getText());
			System.out.println("A value"+a+"B value"+b);
			int result=a*b;
			FinalResult.setText("Answer is:"+result);
		}
		else if (e.getActionCommand().equalsIgnoreCase("Division")) {
	
			int a = Integer.parseInt(getFirst_Number().getText());
			int b = Integer.parseInt(Second_Number.getText());
			System.out.println("A value"+a+"B value"+b);
			int result=a/b;
			FinalResult.setText("Answer is:"+result);
}
		
			
}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		Myframe mf=(Myframe)e.getSource();
		mf.dispose();
		
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


	public TextField getFirst_Number() {
		return First_Number;
	}


	public void setFirst_Number(TextField first_Number) {
		First_Number = first_Number;
	}
}
	
	

