/* Java program to convert Fahrenheit to Celsius and Celsius to Fahrenheit */

class FahrenheitToCelsius {
    public static void main(String[] args) {
	    double Fahrenheit, Celsius;
	
	    Fahrenheit = 100.0;
	    Celsius = (Fahrenheit - 32) * (5.0/9);
	    System.out.println(+Fahrenheit+ " Fahrenheit = " +Celsius+ " Celsius");
	
	    Celsius = 100.0;
	    Fahrenheit = Celsius * (9/5.0) + 32;
	    System.out.println(+Celsius+ " Celsius = " +Fahrenheit+ " Fahrenheit");
	}
}