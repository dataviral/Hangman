import java.util.Scanner;
class fabo{

           public static void main(String[] prog){
                                                  int first=0,number,fabo=0,temp;
                                                  System.out.println("Fibonacci Series || Enter the no of terms to be printed");
                                                  Scanner in = new Scanner(System.in);
                                                  number = in.nextInt();
                                                  for(int i=0;i<number;i++){ 
                                                                        if(fabo<1)
                                                                        fabo = i;
                                                                        else{temp=fabo;
                                                                             fabo=fabo+first;
                                                                             if(first==0) 
                                                                             {
                                                                             first++;
                                                                             }
                                                                             else first=temp;
                                                                            }
                                                                        System.out.println(fabo);
                                                                       }
                                                 }
          } 
