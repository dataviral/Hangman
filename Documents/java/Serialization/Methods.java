import java.io.*;
import java.util.Scanner;

public class Methods {



public Employee[] getEmployeeDetails(int num) {

Employee[] emp = new Employee[num];
System.out.println("Entrer The Details Name, Age and Salary");
for(int i=0;i<num;i++) {
Scanner in = new Scanner(System.in);
System.out.println("enter the details of emloyee : "+ (i+1));
String Name = new String(in.nextLine());
int Age = in.nextInt();
float Salary = in.nextFloat();
emp[i]=new Employee(Name,Age,Salary);
}
return emp;
}

public String serialize(Employee[] emp) {
Scanner in = new Scanner(System.in);
System.out.println("Enter The Name of the file");
String name = in.nextLine();
System.out.println("Serializing File");
try{
FileOutputStream fout = new FileOutputStream(name);
ObjectOutputStream oout = new ObjectOutputStream(fout);
for(int i=0;i<emp.length;i++) {
oout.writeObject(emp[i]);
}
oout.close();

}catch(Exception ex) {
System.out.println(ex.toString());
}
return name;
}

public void deSerialize(String name) {
System.out.println("De_Serializing File");
try{
FileInputStream fin = new FileInputStream(name);
ObjectInputStream oin = new ObjectInputStream(fin);
Employee tmp = new Employee();
for(int i=0;i<3;i++) {
tmp=(Employee)oin.readObject();
System.out.println(tmp.name+" "+tmp.age+" "+tmp.salary);
}
oin.close();
}catch(Exception ex) {
System.out.println(ex.toString());
}
}

}

