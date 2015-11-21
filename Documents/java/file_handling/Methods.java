import java.util.*;
import java.io.*;
class Methods {



public static String readFile(String filename) {
try{
File file = new File(filename);
if(file.exists()) {
System.out.println("Reading From File");
FileReader reader = new FileReader(filename);
BufferedReader read = new BufferedReader(reader);
String str = "";
StringBuilder data = new StringBuilder();
while((str=read.readLine())!=null) 
data.append(str+"\n");
return data.toString();
}
else
return "File dose not exist";
}
catch(Exception ex){
return ex.toString();
}
}

public static String writeFile(String filename,String str) {
try{
File file = new File(filename);
if(file.exists()) {
System.out.println("\nWriting To File");
FileWriter fileWriter = new FileWriter(file,true); 
fileWriter.write(str+" ");                    
fileWriter.close();
return (readFile(filename)+"\n\"File Write Successful\"\n ");
}
else{ 
System.out.println("File dose not Exists\t Crating a New File");
file.createNewFile();
return writeFile(filename,str);
}
}
catch(Exception ex){
return ex.toString();
}
}

public static String copyFile(String fileCopy, String fileMake) {
try {
File file = new File(fileMake);
String str = readFile(fileCopy);
if(file.exists()) {
System.out.println("File "+fileMake+" Alredy exists appending to file");
return writeFile(fileMake,str);
}
else 
return writeFile(fileMake,str);
}
catch(Exception ex){
return ex.toString();
}
}
}
