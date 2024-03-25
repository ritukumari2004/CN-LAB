import java.util.*;
import java.io.*;
class ob1{
  public static void main(String args[])throws IOException{
  FileOutputStream f=new FileOutputStream("123.txt");
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the text and put @ for end.");
  char ch;
  while(true){
  ch=(char)sc.next().charAt(0);
  if(ch!='@')
  f.write(ch);
  else
  break;
  }
  f.close();
  System.out.println("The file is Successfully saved.");
  }
  }
