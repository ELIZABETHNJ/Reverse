# Reverse
import java.io.*;
import java.util.*;
public class Reverse
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String str;
    String reverse="";
    System.out.println("enter the string");
    str=br.readLine();
    int len=str.length();
    
    for(int i=len-1;i>-1;i--)
    {
      reverse=reverse+str.charAt(i);
    }
  System.out.println("Reversed String is: "+reverse);
  }
  }
