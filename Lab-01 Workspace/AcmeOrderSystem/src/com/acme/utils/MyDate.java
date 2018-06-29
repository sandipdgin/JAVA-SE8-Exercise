package com.acme.utils;

public class MyDate {
	/*
	 * public int day; public int year; public int month;
	 */

	// Lab08-Encapsulation start
	private byte day;	
	private byte month;
	private short year;
	// Lab08-Encapsulation end

	/*{
		day = 1;
		year = 2000;
		month = 1;
	}*/
	
	// Lab08-Encapsulation start
		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			if (valid(day, month, year)) {
				this.day = (byte) day;
			}

		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			if (valid(day, month, year)) {
				this.month = (byte) month;
			}

		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			if (valid(day, month, year)) {
				this.year = (short)year;
			}
		}

		private boolean valid(int day, int month, int year) {
			 if (day > 31 || day < 1 || month > 12 || month < 1) {
				 System.out.println("Attempting to create a non-valid date" + month + "/" + day + "/" + year);
				 return false;
			 }
			 switch (month) {
			 case 4:
			 case 6:
			 case 9:
			 case 11:
			 return (day <= 30);
			 case 2:
			 return day <= 28 || (day == 29 && year % 4 == 0);
			 }
		 return true;
		 }

		// Lab08-Encapsulation end

	public MyDate() {

	}

	public MyDate(int m, int d, int y) {
		// ...use the parameters of m, d and y to set the three attributes
		setDate(m, d, y);
	}

	public String toString() {
		// TODO return a string with month/day/year like “01/20/1964”
		return month + "/" + day + "/" + year;
	}

	public void setDate(int m, int d, int y) {
		// TODO set the MyDate attributes with m, d, and y values here!
		/*day = d;
		year = y;
		month = m;*/
		if (valid(d, m, y)) {
			 day = (byte) d;
			 year = (short) y;
			 month = (byte) m;
		 }
	}

	public static void leapYears() {
		for (int i = 1752; i <= 2020; i = i + 4) {
			if ((i % 100 != 0) || (i % 400 == 0))
				System.out.println("The year " + i + " is a leap year");
		}

	}

	

}
