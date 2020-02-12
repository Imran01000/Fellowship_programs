package fellowship_programs;

import java.util.Scanner;
class Replace_username
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String s=sc.nextLine();
    String s1="Hello ,how are you";
    String s2="";
    int index=5;
    for(int i=0;i<s1.length();i++)
    {
      s2+=s1.charAt(i);
      if(i==index)
      {
        s2+=s;
      }
    }
    System.out.println(s2);
    
    
  }
}