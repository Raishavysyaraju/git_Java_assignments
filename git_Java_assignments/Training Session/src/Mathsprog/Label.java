package Mathsprog;

import java.awt.Frame;
import java.awt.TextField;

public class Label extends Frame{
	

	public Label(String string) {
		// TODO Auto-generated constructor stub
		this.setLayout(null);
		Label firstL= new Label("Enter First Number");
		add(firstL);
		TextField First_Number =new TextField();
		First_Number.setBounds(100, 60, 100, 30);
		add(First_Number);
		
		Label secondL= new Label("Enter Second Number");
		this.add(secondL);
		TextField Second_Number =new TextField();
		Second_Number.setBounds(210, 60, 100, 30);
		this.add(Second_Number); 
		
	}

	
	//Text fields
	
			
			//	String S = First_Number.getText();
				//System.out.println("s value is"+S);
				
			//	TextField Second_Number =new TextField();
			//	Second_Number.setBounds(210, 60, 100, 30);
			//	add(Second_Number);  
	}

