/* Determining Leap Year A year is a leap year if it is divisible by 4 but not by 100 or if it is divisible by 400. 
   So you can use the following Boolean expression to check whether a year is a leap year */
   
class LeapYear {
    public static void main(String [] args) {
	    int year = 1995;
		
		boolean flag = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		
		if(flag) {
		    System.out.println(+year+ " is a leap year");
		}
		else {
		    System.out.println(+year+ " is not a leap year");
		}
	}
}