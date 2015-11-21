/* Java Program to for Numeric Type Conversion (higher to lower order) */

class NumericTypeConversion2 {
    public static void main(String [] args) {
	
	    int i = 129;
        byte b = (byte) i;
	
		System.out.println(b);  // Output : for (i = 129 , b = -127); for (i = 128 , b = -128) 

        float f = (float) 10.1;
        i = (int) f;
		
		System.out.println(i);   // Output : for (f = 10.1 , i = 10); for (f = 12.3 , i = 12)
		
	}
}