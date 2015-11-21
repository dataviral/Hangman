class main{

public static void main(String[] args){
Car audi = new Car();
Car bmw = new Car();
Car ford = new Car();

audi.color="Black";
audi.model="A4";
audi.height=100;
audi.weight=700;
audi.max_speed=260;


bmw.color="White";
bmw.model="D4000";
bmw.height=101;
bmw.weight=820;
bmw.max_speed=230;


ford.color="Red";
ford.model="Enzo";
ford.height=95;
ford.weight=760;
ford.max_speed=210;

System.out.println(audi.color);
System.out.println(audi.model);
System.out.println(audi.height);
System.out.println(audi.weight);
System.out.println(audi.max_speed);

System.out.println();

System.out.println(bmw.color);
System.out.println(bmw.model);
System.out.println(bmw.height);
System.out.println(bmw.weight);
System.out.println(bmw.max_speed);

System.out.println();

System.out.println(ford.color);
System.out.println(ford.model);
System.out.println(ford.height);
System.out.println(ford.weight);
System.out.println(ford.max_speed);

System.out.println();

ford.start();
System.out.println();
bmw.speedUp();
System.out.println();
audi.stop();


employee v,w,x,y,z;
v= new employee("A01",31,100000);
w= new employee();
x= new employee("Z03",24,213132);
y= new employee();
z= new employee("XZ21",43,141142);

System.out.println();
System.out.println();
System.out.println();
System.out.println(v.id+"  "+v.age+"  "+v.salary);
System.out.println();
System.out.println(w.id+"  "+w.age+"  "+w.salary);
System.out.println();
System.out.println(x.id+"  "+x.age+"  "+x.salary);
System.out.println();
System.out.println(y.id+"  "+y.age+"  "+y.salary);
System.out.println();
System.out.println(z.id+"  "+z.age+"  "+z.salary);
System.out.println();

constructor u = new constructor();

System.out.println();
System.out.println();
System.out.println(u.a);
System.out.println();
System.out.println(u.b);
System.out.println();
System.out.println(u.c);
System.out.println();
System.out.println(u.d);
System.out.println();
System.out.println(u.e);

}

}
