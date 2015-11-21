/* Program to print prime number between 100 to 200 using for loop */

class PrimeForLoop2 { 
    public static void main(String[] args) {
        
        int number = 100;
		int flag = 0;
		while (number >= 100 && number <= 200) {
        flag = 0;
		for(int i = 2 ; i < number; i++) {
		    if(number % i == 0) {
		       flag=1;
			}
		} 
		if (flag==0)
		 System.out.println(number);
		
		number++;
	}
	}
}		 