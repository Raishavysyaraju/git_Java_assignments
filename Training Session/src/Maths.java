
public class Maths {
	
	public void sub(int a,int b)
	{
		int Result = a-b;
		System.out.println("Substraction of A & B Is:" + Result);
	}
	
	public void div(int a,int b)
	{
		int Result = a/b;
		System.out.println("Division of A & B Is:" + Result);
	}
	
	public void square(int a)
	{
		int Result = a*a;
		System.out.println("Square of A & B Is:" + Result);
	}
	//cube
	public void cube(int a)
	{
		int Result = a*a*a;
		System.out.println("Cube of A & B Is:" + Result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maths m = new Maths();
		m.square(10);
		m.sub(25,3);
		m.cube(5);
		m.div(26, 3);

	}

}
