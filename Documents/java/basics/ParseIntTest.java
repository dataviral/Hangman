/*  Execute below statements

String empID = “e1″;

int eid = Integer.parseInt(empID); */


class ParseIntTest {
    public static void main(String[] args) {
	    String empID = "e1";

        int eid = Integer.parseInt(empID);  
	    System.out.println(eid);
	}
}

/* Output : No Compiler Error 
            Run Time Error occurs as Exception -> java.lang.NumberFormatException : For input string "e1"
			
			As String Data Types can not be converted into Number Data Type 
		    (Number Data Types can be converted among itself i.e int to double; byte to int etc...)
		    So goes for the String Data Types...   */