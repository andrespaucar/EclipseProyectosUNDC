package com.undc.andres;
import java.io.FileInputStream;
import java.io.IOException;

public class intro1{
public static void main(String [] args}{
try{
 FileInputStream fis =new FileInputStream("D:\\ archivo.txt");
 int contador =0;
 int b;
 while((b=fis.read()) !=-1){
contador++;
}
fis.close();
System.out.println("Intro 1");
System.out.println(contador);
 }catch(IOException e){
System.err.println(e);
 }
 }
}