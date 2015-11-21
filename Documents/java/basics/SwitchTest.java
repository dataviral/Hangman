/* Program to check how switch statement works */

class SwitchTest {
    public static void main(String [] args) {
	    char ch = 'b';
		
		switch(ch) {
		case 'a' : System.out.println(ch);    
		case 'b' : System.out.println(ch);
		case 'c' : System.out.println(ch);
	    }
	}
}

/* Output : b
            b
			This is because there is no break statement after the case 'b' ,so it will go to case 'c' 
			and since the char ch=b is initialized to in case 'c' also it will have the value b. */

	/*      But if we use break statement, it will only print the value assigned (i.e -> b)  */