
public class MyDate {
	int day;
	int year;
	int month;
	
	{
		day = 1;
		year = 2000;
		month = 1;				
	}
	public MyDate(){
		
	}
	
	public MyDate(int m, int d, int y){
		//...use the parameters of m, d and y to set the three attributes
		setDate(m,d,y);
	}
	
	public String toString(){
		//TODO return a string with month/day/year like “01/20/1964”
		return month + "/" + day + "/" + year;
	}
	
	public void setDate(int m, int d, int y){
		 //TODO set the MyDate attributes with m, d, and y values here!
		day = d;
		year =y;
		month = m;
	} 



}
