/* Java Program to for Numeric Type Conversion (higher to lower order) */

class NumericTypeConversion {
    public static void main(String [] args) {
	
	    int i = 12;
		byte b = i;   // To make this compatible, we have to use 'Casting' i.e -> byte b = (byte) i;
	    
	
	    System.out.println(b);      
		
		//Output : incompatible types : possible lossy conversion from int to byte (byte b = i).
	   // This occurs because int is greater than byte some data can be loss as byte has less storage area.
	   
	   /*   byte	Range : {-27 (-128) to 27 – 1(127)}	                 8-bit signed 
	        int	    Range : {-231 (-2147483648) to 231 – 1(2147483647)}	 32-bit signed  */
	   
	   /* But the conversion from byte to int there is no compiler error, as int has more space to store any values of byte */
	   /* byte b = 10;
	      int i = b;
		  System.out.println(i) */
	}
}