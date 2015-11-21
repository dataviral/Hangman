

abstract class Flyable {

void start(){};
void fly(){};
void land(){};
void firstAid(){
System.out.println("You are being administered first aid");
}
}

class Jet extends Flyable {

public void start(){
}

public void fly(){
}

public void land(){
}
}

class Helicarfter extends Flyable {

public void start(){
}

public void fly(){
      System.out.println("Helicrafter is flying");
}

public void land(){
}
}

class Aeroplane extends Flyable {

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
           Helicarfter apache = new Helicarfter();
           A360.start();
           A360.firstAid();
           apache.fly();
           apache.firstAid();
              
}
}

