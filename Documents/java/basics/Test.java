// Just execute this code in the cmd  using javac Test.java.
// Now in the cmd type dir, you will see three dot class file created(A.class,B.class,C.class)
// This .class file are the byte codes 

// Each class can be compile and execute separately in cmd using javac A/javac B/javac C && java A/java B/java C.


/* Note : Not necessarily the file name (Test.java) and class name should have to be same 
     (i.e class Test - but here we used class A) */

class A {




}

class B {
    public static void main(String [] abhi) {                     // start of the program 
	                                                             // Note : abhi it is a varible we can write anything like- args, don etc..
	    System.out.println("Hi There !!! \n How are you ???");
	}
}

class C {
    public static void main(String [] args) {
	    int num1 = 100;
		double num2 = 25.26;
		double sum;
		
		sum = num1 + num2;
		
		System.out.println(sum);
	}
}
