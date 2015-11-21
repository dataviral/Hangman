/* Program to check if the number is divisible by 6 using for Loop */

class DivideForLoop { 
    public static void main(String[] args) {
	
	int number = 36;
	
	for(int i = 0; i <1; i++) {
	    if (number % 6 == 0) 
		System.out.println(number+ " is divisible by 6 ");
		else
		System.out.println(number+ " is not divisible by 6 ");
	   }
	}
}