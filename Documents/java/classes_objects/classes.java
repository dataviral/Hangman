/* 

1.Create a class Car with 5 properties and 3 behaviors. Create 3 objects and initialize the data members with some values and display the result. using object of car    call the member methods.

2.Create a class Employee with one explicit constructor to initialize the members with your default values and add one more constructor with parameters (make use of   this pointer). Create 5 employee objects and display the employee details.

3.Create a class called Constructor with one data member for every primitive data type and create a object and display the members values with out initializing it to know the default values assigned by constructor.

*/


class Car{

String color;
String model;
int height;
int weight;
int max_speed;

public void start(){
System.out.println("the car is starting");
}

public void stop(){
System.out.println("the car has come to a halt");
}

public void speedUp(){
System.out.println("the car is speeding up");
}


}

class employee{

String id;
int age;
float salary;

employee(){
id="Not Specified";
age=0;
salary=000;
}

employee(String id,int age,float salary){
this.id=id;
this.age=age;
this.salary=salary;
}
}

class constructor{

char a;
int b;
boolean c;
double d;
float e;

}


