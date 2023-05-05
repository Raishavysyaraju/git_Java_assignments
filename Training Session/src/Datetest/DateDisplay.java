package Datetest;

public class DateDisplay {
	
	private int Day;
	private int Month;
	private int Year;
	
	public DateDisplay(int Day,int Month,int Year) 
	{
		setDay(Day);
		setMonth(Month);
		setYear(Year);
	/*	this.Day=Day;
		this.Month=Month;
		this.Year=Year;*/
	}
		
	public void setYear(int year2) {
		// TODO Auto-generated method stub
		this.Year=year2;
		if(Year==2023)
			this.Year=2023;
		else
		this.Year=2023;
	}

	public int getDay() {
		return this.Day;
	}	
	
	public void setDay(int day) {
		this.Day = day;
		if(Month==2)
		{
			int Y= getYear();
			if(Y/4==0 ||( Y/400==0 && Y/100!=0)) {
				this.Day=29;
			}
		if(Day<1)
			this.Day=1;
		else if(Day>28)
			this.Day=28;
				
			
		}
		if(Month!=2)
		{
		if(Month>=1 || Month<=12) {
				
				if(Month==1 || Month ==3 || Month==5 || Month ==7 || Month==8 || Month ==10 || Month ==12) 
				{
					for(int J=1;J<32;J++) 
						{
						this.Day=J;
					}}
				
					//else if(Day<1)
					//	this.Day=1;
				//	else 
					//	this.Day=31;
				
				}
		
					if(Month==4 || Month ==6 || Month==9 || Month ==11) {
						
						for(int J=1;J<=30;J++) {
							this.Day=J;
						}
					}
						if(Day>30)
							this.Day=30;
					}
				
				}
			
					
	public int getYear() {
		// TODO Auto-generated method stub
		return this.Year;
	}

	public int getMonth(){
		return this.Month;
	}
	
	public void setMonth(int month) {
		this.Month = month;
		if(Month>12) 
			this.Month=12;
		else if (Month<1) 
			this.Month=1;
		if(Month>=1 && Month<=12) {
			if(Month==1 || Month ==3 || Month==5 || Month ==7 || Month==8 || Month ==10 || Month ==12) {
				if(Day>31)
					this.Day=31;
				else if(Day<1)
					this.Day=1;
				
				if(Month==4 || Month ==6 || Month==9 || Month ==11) {
					if(Day>30)
						this.Day=30;
					else if(Day<1)
						this.Day=1;
					
			}
			
			
}
		
		
	}
	}

	public String toString() {
		return Day+"-"+Month+"-"+Year;
	}


}//Date Class

