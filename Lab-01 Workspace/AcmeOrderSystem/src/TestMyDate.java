

public class TestMyDate{

	public static void main(String[] args){
		// option 1 to initialize date
		MyDate date1 = new MyDate(11,11,1918);
		
		// option 2 to initialize date
		MyDate date2 = new MyDate();
		date2.day = 11;
		date2.month = 11;
		date2.year = 1918;
		
		// option 3 to initialize date
		MyDate date3 = new MyDate();
		date3.setDate(4,21,1968);

		String str1 = date1.toString();
		String str2 = date2.toString();
		String str3 = date3.toString();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		// bonus lab - option 4 to initialize default date
		MyDate date4 = new MyDate();
		String str4 = date4.toString();
		System.out.println(str4);
	}
}