import java.io.*;

class Operations extends Calculator{

public String getFirstLetters(String str) {

System.out.println("First Letters of each word in the string "+ "\"" +str+ "\"" +" ARE");

char[] array = new char[(str.toCharArray()).length];
array = str.toCharArray();
char[] array2 = new char[200];

for(int i=0;i<array.length;i++) {
if(i==0) 
array2[i] = array[i];
if(array[i]==' ') 
array2[i] = array[i+1];
}
String str2 = new String(array2);
return str2;
}

public String reverseString(String str) {

System.out.println("The Revers of the string "+ "\"" +str+ "\"" +" is :");

char[] array = new char[(str.toCharArray()).length];
array = str.toCharArray();

array=Calculator.reverseArray(array);

String str2 = new String(array);
return str2;

}


public boolean checkMail(String str) {
System.out.println("Cheking email address " + "\"" +str+ "\""+" for validity");

char[] array = new char[(str.toCharArray()).length];
array= str.toCharArray();
boolean flag=true;
int tmp;
for(int i=0;i<array.length;i++) {
tmp=array[i];
if((tmp>='a' && tmp<='z')||(tmp >= '1' && tmp<= '9')||tmp=='@'||tmp=='.') 
flag=true;
else{ 
flag=false;
return flag;
}
}
return flag;
}


public int giveRating(String str) {

System.out.println("Rating of The paragraph \""+str+"\" is :");

char[] array = new char[(str.toCharArray()).length];
String tmp = new String();
array = str.toCharArray();
int rating=0;

for(int i=0;i<array.length;i++) {

if(array[i] != ' '||array[i] != ',')
tmp=tmp+array[i];

if(array[i] == ' '||array[i] == ',')
tmp = "";

if(tmp.equals("good")||tmp.equals("amazing")||tmp.equals("great")||tmp.equals("nice")||tmp.equals("cool"))
rating++;

if(tmp.equals("bad")||tmp.equals("worse")||tmp.equals("ugly")||tmp.equals("disaster"))
rating--;

}
return rating;
}

public static String[] sortStringArray(String[] array) {
System.out.println("Sorting The array :");
Calculator.printArray(array);
System.out.println();

for(int i=0; i <array.length; i++) {
for(int j=1; j <array.length; j++) {
if(array[j-1].compareTo(array[j])>0) {
String tmp=array[j-1];
array[j-1]=array[j];
array[j]=tmp;
}
}
}
return array;
}

}
