/* Program to checka number is odd or even using conditional statements */

class ConditionalStatements {
    public static void main(String[] args) {
	    int number = 64;
		
		boolean even = number % 2 == 0;
		
		if(even) {
		    System.out.println(+number+ " is an even number");
		}
		else {
		    System.out.println(+number+ " is an odd number");
		}
	}
}