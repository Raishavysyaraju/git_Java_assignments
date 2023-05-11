package Mathsprog;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
//import java.io.IOException;

public class Myframe extends Frame {

	public Myframe(boolean visible, String Title, int x, int y, int width, int height) {
		this.setVisible(visible);
		this.setTitle(Title);
		this.setBounds(x, y, width, height);
		this.setLayout(null);
		this.addWindowListener(new MasterHandler());
		//this.addMouseListener(new MasterHandler());
		
		//text fields
		
		Label firstL= new Label("Enter First Number");
		firstL.setBounds(20, 40, 110, 20);
		add(firstL);
		
		TextField First_Number =new TextField();
		First_Number.setBounds(150, 40, 80, 20);
		add(First_Number);
		
		Label secondL= new Label("Enter Second Number");
		secondL.setBounds(240, 40, 140, 20);
		this.add(secondL);
		TextField Second_Number =new TextField();
		Second_Number.setBounds(390, 40, 80, 20);
		this.add(Second_Number); 
		
		Label FinalResult= new Label("Answer is:");
		FinalResult.setBounds(150, 90, 80, 20);
		add(FinalResult);
		
		
		//Buttons
		Button addBtn = new Button("Add");
		Button subBtn = new Button("Substract");
		Button multiBtn = new Button("Multiply");
		Button divBtn = new Button("Division");
		this.add(addBtn);
		addBtn.setBounds(100, 130, 80, 30);
		addBtn.addActionListener(new MasterHandler(First_Number, Second_Number, FinalResult));
		
		this.add(subBtn);
		subBtn.setBounds(180, 130, 80, 30);
		subBtn.addActionListener(new MasterHandler(First_Number, Second_Number, FinalResult));
		
		this.add(multiBtn);
		multiBtn.setBounds(260, 130, 80, 30);
		multiBtn.addActionListener(new MasterHandler(First_Number, Second_Number, FinalResult));
		this.add(divBtn);
		divBtn.setBounds(340, 130, 80, 30);
		divBtn.addActionListener(new MasterHandler(First_Number, Second_Number, FinalResult));
		
		
	}
	
	
	
	
}
