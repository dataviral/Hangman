/* Program to print number between 100 to 200 which are divisible by 6 using for loop */

class DivideForLoop2 { 
    public static void main(String[] args) {
	
	for(int i = 100; i <= 200; i++) {
	    if (i % 6 == 0) 
		System.out.println(i);
		
	   }
	}
}