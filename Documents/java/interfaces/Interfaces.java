/*
Assignments :

1. Create an Interface called Flyable with the methods start(), fly() & land(). Implement the Flyable interface in Helicrafter, Aeroplane & Jet. Create the object of Aeroplane and call start & fly method.

2. Why Interfaces are necessary ? Ans: Interfaces Play a key Role in enforcing design methodologies. 

3. Can I create an Object of type Flyable but instantiate Aeroplane ? Ans: Yes

*/

interface Flyable {

void start();
void fly();
void land();

}

class Jet implements Flyable {

public void start(){
}

public void fly(){
}

public void land(){
}
}

class Helicarfter implements Flyable {

public void start(){
}

public void fly(){
}

public void land(){
}
}

class Aeroplane implements Flyable {

public void start(){
      System.out.println("Aeroplane has started");
}

public void fly(){
      System.out.println("Aeroplane is flying");
}

public void land(){
}
}


class Test {
     public static void main(String[] args) {

           Aeroplane A360 = new Aeroplane();

           A360.start();
           A360.fly();
}
}

