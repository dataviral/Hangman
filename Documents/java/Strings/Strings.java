/*

Assignments:

1. Write a method which accepts a string as argument and returns the first letter of every word clubbed into a string.

2. Write a method to reverse a string without using StringBuffer or StringBuilder.

3. A method which returns true if the email address is valid.

4. A method which returns the rating of a movie(1, 9) if a paragraph of text is given as a input. Here you need to count all the +ve words like good, amazing, better etc and all the -ve words like bad, not good, worst etc and apply a logic to give a rating in number and return it.

5. Write a method which accepts array of strings as input and returns the sorted string array.

*/

import java.util.*;

class Test {

public static void main(String[] args) {

Operations obj1 = new Operations();

String str = "Write a method which accepts a string as argument";
String str2 = "aviral@gmail.com";
String str3 = "amazing,worse,ugly,good,nice,great,cool,amazing";

System.out.println();


System.out.println(obj1.getFirstLetters(str));
System.out.println();


System.out.println(obj1.reverseString(str));
System.out.println();


System.out.println(obj1.checkMail(str2));
System.out.println();

System.out.println(obj1.giveRating(str3));
System.out.println();

String[] array = {"hi","i","am","aviral","and","i","am","seventeen","years","old"};
array=obj1.sortStringArray(array);
Calculator.printArray(array);



}

}


