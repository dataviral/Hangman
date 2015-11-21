import java.util.Scanner;
class calc {


      public static int add(){       //to add
      int x,y;
      System.out.println("enter 2 integrs || addition");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();  
      y = in.nextInt();
      return x+y;
      }
      public static double add2(){
      double x, y;
      System.out.println("enter 2 no.s || addition");	
      Scanner in = new Scanner(System.in);
      x = in.nextDouble();  
      y = in.nextDouble();
      return x+y;
      }
      
      public static double getspeed(){      //speed
      double x,y;
      System.out.println("enter distance and time || addition");	
      Scanner in = new Scanner(System.in);
      x = in.nextDouble();  
      
      y = in.nextDouble();
      return x/y;
      } 
      
      public static double getarea(){     //area
      double x;
      System.out.println("enter radius || area");	
      Scanner in = new Scanner(System.in);
      x = in.nextDouble();
      return x*x*3.141;
      }

      public static long getfac(){    //factorial
      long fac=1,x;
      System.out.println("enter an integr || factorial");	
      Scanner in = new Scanner(System.in);
      x = in.nextLong();  
      if(x!=0){
      while(x>0){
      fac=fac*x;
      x--;
      }
      }
      return fac;
      } 

      public static boolean geteo(){   //bollean even/odd
      int x;
      System.out.println("enter an integr || even(true)/odd(false)");	
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      if(x%2 !=0)
      return false;
      else 
      return true;
      }

      public static boolean getprime(){  //prime
      int x;
      System.out.println("enter an integr || prime(true)");	
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      int i =x-1,flag=1;
      while(i >1){
      if(x%i ==0){
      flag=0;
      }
      i--;
      }
      if(flag==1)
      return true;
      else 
      return false;
        }
      
      public static boolean getpalin(){ //palindrome
      long x;
      System.out.println("enter a number ||  palindrome(true)");	
      Scanner in = new Scanner(System.in);
      x = in.nextLong();
      long rem,rev=0,tmp=x;
      while(tmp>0){
      rem=tmp%10;
      rev=rev*10 + rem;
      tmp=tmp/10; 
      }
      if(rev==x)
      return true;
      else 
      return false;
      }
 
      public static void fibo(){  //fibonacci sereies
      int x;
      System.out.println("enter the no. of terms");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      int first=0,fib=0,temp;
      for(int i=0;i<x;i++){ 
                                if(fib<1)
                                fib = i;
                                else{temp=fib;
                                     fib=fib+first;
                                     if(first==0) 
                                      first++;
                                     else 
                                     first=temp;
                                     }
                                System.out.println(fib);                                    
                                }
      }
      
      public static boolean div6(){  //divisible by 6
      int x;
      System.out.println("enter an integer || divisible by 6 (ture)");	
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      if(x%6==0)
      return true;
      else
      return false;
      }
      
      public static double gethr(){ //time in hours
      long x;
      System.out.println("enter time in seconds || hours conversion");	
      Scanner in = new Scanner(System.in);
      x = in.nextLong();
      long y =x/3600;
      return y;
      }

      public static int getdigits(){ //no of digits
      long x;
      System.out.println("enter an integer || no of digits");	
      Scanner in = new Scanner(System.in);
      x = in.nextLong();
      int dig=0;
      while(x>0)
      { 
      x=x/10;
      dig++;
      }
      return dig;
      } 
      
      public static long doubledigits(){  //repeat digits
      long x;
      System.out.println("enter an integer || repeat no twice");	
      Scanner in = new Scanner(System.in);
      x = in.nextLong();
      long y=x,z=x;
      long dig=0;
      while(y>0)
      { 
      y=y/10;
      dig++;
      }
      while(dig>0)
      {
      z=z*10;
      dig--;
      }
      return z+x;
      }
 
      public static int hundigit(){  //val of 100th digit
      int x;
      System.out.println("enter an integer || val of 100th digit");	
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      x=x/100;
      int val= x%10;
      return val;
      }  

      public static double runrate(){ //runrate
      double target,max,run,over;
      System.out.println("enter target,max,run,over || required run rate");	
      Scanner in = new Scanner(System.in);
      target = in.nextInt();
      
      max = in.nextInt();
      
      run = in.nextInt();
      
      over = in.nextInt();
      double rr=(target-run)/(max-over);
      return rr;
      }

      public static double getdeci(){  //make decimal
      int x,y,z;
      System.out.println("enter three integers || decimal form ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
 
      z = in.nextInt();
      double a=x,b=y,c=z,d=0;
      d=a+(b/10)+(c/100);
      return d;
      }
 
      public static int sumdigits(){  //sum of digits
      int x;
      System.out.println("enter an integer || sum of digits ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      int y=0;
      while(x>0){
      y=y+(x%10);
      x=x/10;
      }
      return y;
      }
      
      public static boolean and(){  //and of three booleans
      boolean x,y,z;
      System.out.println("enter three booleans  || and of booleans ");
      Scanner in = new Scanner(System.in);
      x = in.nextBoolean();
 
      y = in.nextBoolean();
 
      z = in.nextBoolean();
      return x && y && z;
      }
      
      public static boolean grater(){  //grater than
      int x,y,z;
      System.out.println("enter three integers  || first num grater than 2nd or 3rd(true) ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      y = in.nextInt();
 
      z = in.nextInt();
      boolean a = x>y || x>z;
      return a;
      }        
       
      public static boolean ascending(){  //ascending
      int x,y,z;
      System.out.println("enter three integers  || ascending order (true) ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      y = in.nextInt();
      z = in.nextInt();
      boolean a = x<y && x<z;
      return a;
      }   

      public static int sumlast4(){  //sum of last 4 digits
      int x;
      System.out.println("enter an integer 4+ digits || sum of last 4 digits ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();    
      int tmp=0,i=4;
      while(i>0)
      {
       tmp=tmp+ x%10;
       x=x/10;
       i--;
      }
      return tmp;
      }

      public static int area(){  //area
      int a,x,y,z;
      System.out.println("enter three integers  || area ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
  
      z = in.nextInt();
  
      a = in.nextInt();
      return a*x*y*z ;
      }   
      
      public static int sum4(){  //sum of gen 4 digits no.s
      int x,y,z;
      System.out.println("enter three integers  || sum of gen 4 digits no.s");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
        y = in.nextInt();
   
      z = in.nextInt();
      x=(x*1000)+(x*100)+(x*10)+x;
      y=(y*1000)+(y*100)+(y*10)+y;
      z=(z*1000)+(z*100)+(z*10)+z;
      return x+y+z;
      }

      public static boolean mul37(){  //multiple of 3 and 7
      int x;
      System.out.println("enter an integer  || multiple of 3 and 7");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      if(x%3 ==0 && x%7 ==0)
      return true;
      else 
      return false;
      }

      public static int largest(){  //largest of three
      int x,y,z;
      System.out.println("enter three integers  || largest of three");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
   
      y = in.nextInt();
   
      z = in.nextInt();
      if(x>y && x>z)
      return x;
      else if(y>x && y>z)
      return y;
      else
      return z;
      }

      public static int days(){  //days in month
      int x;
      System.out.println("enter an integer || days in the month");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      if(x == 1 ||x == 3 ||x == 5 ||x == 7 ||x == 8 ||x == 10 ||x ==12)
      return 31;
      if(x == (2))
      return 28;
      else
      return 30;
      }

      public static char change(){ // change char case
      char x;
      System.out.println("enter a charecter || change char case");
      Scanner in = new Scanner(System.in);
      x = in.next().charAt(0);
      if(x >='a' && x<='z') 
      return (char)(x-32);
      if(x >='A' && x<='Z')
      return (char)(x+32);
      else
      return x;
      }

      public static boolean check(){ // num or alpha
      char x;
      System.out.println("enter a charecter || num or alpha");
      Scanner in = new Scanner(System.in);
      x = in.next().charAt(0);
      if(x >='0' && x <='9')
      return true;
      else 
      return false;
      }

      public static char middle(){ // middle char
      char x,y,z;
      System.out.println("enter three charecter || middle char");
      Scanner in = new Scanner(System.in);
      x = in.next().charAt(0);
      y = in.next().charAt(0);
      z = in.next().charAt(0);   
      if ((x>y && x<z) || (x<y) && (x>z))
      return x;
      else if ((y<x && y>z) || (y>x && y<z))
      return y;
      else
      return z;
      }

      public static boolean lastdigit(){  //equal last digit 
      int x,y;
      System.out.println("enter 2 whole no.s || equal last digits");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt(); 
      if(x%10 == y%10)
      return true;
      else 
      return false;
      }
 
      public static boolean add3(){  //sum of 2 equlas third
      int x,y,z;
      System.out.println("enter 3 no.s || sum of 2 equlas third");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
      if(x+y==z || y+z == x || x+z == y)
      return true; 
      else 
      return false;
      }

      public static int lottery(){ // prize 
      int x;
      System.out.println("enter no of lottery tickets || lottery prize");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      if( x%4==0)
      return 6;
      else if( x%7==0)
      return 10;
      else if( x%4==0 && x%7==0)
      return 20;
      else 
      return 0;
      }

      public static int lottery2(){ // lottery prize
      int x,y,z;
      System.out.println("enter no on the three lottery tickets || lottery prize");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
      int lottery=0;
      if( x%4==0 || y%4==0 || z%4==0 )
      lottery = lottery + 6;
      else if( x%7==0 || y%7==0 || z%7==0)
      lottery = lottery + 10;
      else if( x%4==0 && x%7==0 || y%4==0 && y%7==0 || z%4==0 && z%7==0)
      lottery = lottery + 20;
      return lottery;
      }

      public static int last3(){ //sum of last 3 digits
      int x;
      System.out.println("enter an integer || sum of last 3 digits");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      int tmp=0,i=3;
      while(i>0)
      {
       tmp=tmp+ x%10;
       x=x/10;
       i--;
      }
      return tmp;
      }

      public static int comp21(){ //comp with 21
      int x,y;
      System.out.println("enter 2 integers || comp with 21");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      if( x>21 && y>21)
      return -1;
      else if(x>21 && y<=21)
      return y;
      else if(y>21 && x<=21)
      return x;
      else if(y==x && x<=21) 
      return -2;
      else 
      return 0;
      }

      public static int rev(){ //reverse a no
      int x;
      System.out.println("enter an integer || reverse the number(3 digit only)");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      int tmp=0,a,b,c;
      a=x%10;
      x=x/10;
      b=x%10;
      x=x/10;
      c=x%10;
      tmp=(a*100)+(b*10)+(c);
      return tmp;
      }
      
      public static boolean perfect(){ // perfect no
      int x;
      System.out.println("enter an integer || perfect no(true)");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      int i,tmp=0;
      for(i=1;i<x;i++)
      {
      if (x%i==0)
      tmp=tmp+i;
      }
      if(tmp==x)
      return true;
      else 
      return false;
      }

}
