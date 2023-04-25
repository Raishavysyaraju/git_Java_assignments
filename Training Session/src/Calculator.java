import java.io.IOException;

public class Calculator {
	byte number1[]=new byte[255];
	byte number2[]=new byte[255];
		
	public void Add() throws IOException {
		System.out.println("Please enter A value");
	int	A= System.in.read(number1);
	System.out.println("A value entered as"+A);
		System.out.println("Please enter B value");
	int	B= System.in.read(number2);
		int Result = A+B;
		System.out.println("Addition of A & B is:"+Result);
	}//Add
	
	public void Substract() throws IOException{
		System.out.println("Please enter A value");
		int	A= System.in.read(number1);
		System.out.println("Please enter B value");
		int	B= System.in.read(number2);
		int Result = A-B;
		System.out.println("Substraction of A & B is:"+Result);
	}//Sub
	public void Multiply() throws IOException{
		System.out.println("Please enter A value");
		int A= System.in.read(number1);
		System.out.println("Please enter B value");
		int B= System.in.read(number2);
		int Result = A*B;
		System.out.println("Multiplication of A & B is:"+Result);
	}//mul
	public void Divison() throws IOException{
		System.out.println("Please enter A value");
		int	A= System.in.read(number1);
		System.out.println("Please enter B value");
		int B= System.in.read(number2);
		int Result = A/B;
		System.out.println("Division of A & B is:"+Result);
	}//div

	public void show() throws IOException  {
		
			System.out.println("Display Menu Items are:");
			System.out.println("1:Addition");
			System.out.println("2:Substraction");
			System.out.println("3:Multiplication");
			System.out.println("4:Division");
			
			//System.in.read(UserOption);
		//	String SS= new String (UserOption);
			//int Choice= Integer.parseInt(SS);
	}

	public static void main(String[] args) throws IOException {
						
		Calculator c_ref = new Calculator();
	 	c_ref.show();
	 	System.out.println("Please select your choice from the Menu");
	 	byte UserOption[] = new byte[255];			
	 
		int A= System.in.read(UserOption);
		System.out.println("Aholds:"+A);
	/*	String SS= new String (UserOption);
		System.out.println("SS value is:"+SS);
		int Choice= Integer.parseInt(A);		 	
			system.out.println(Choice);  */
			 	switch( A ) 
			{
			 
			 
			 case 1:
				 			
				 	c_ref.Add();
			 case 2:
				 
					 c_ref.Substract();
				
			 case 3:
				 				
					 c_ref.Multiply();
			case 4:
						 					
					 c_ref.Divison();
			}//Switch
	
			 //	return 0;
		}//show	

}//Class
