package fellowship_programs;

import java.util.*;
class Anagram {
  static int A;
   public static void sort(char a[])
   {
     char temp=0;
     for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a.length-1;j++)
       {
         if(a[j]>a[j+1])
         {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
         }
       }
     }
     
   }
  public static void main(String[] args) {
    String s1=new String();
    String s2=new String();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Two Strings : ");
    s1=sc.nextLine();
    s2=sc.nextLine();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    char c1[]=s1.toCharArray();
    char c2[]=s2.toCharArray();
    sort(c1);
    sort(c2);
    System.out.println("The sorted Strings are :---->");
    for(int i=0;i<c1.length;i++)
      System.out.print(c1[i]);

    System.out.println();
     for(int i=0;i<c1.length;i++)
        System.out.print(c2[i]);

   System.out.println();
     for(int i=0;i<c1.length;i++)
     {   
      if(c1[i]==c2[i])
        A++;
     }
    if(A==c1.length)
    System.out.println("Strings are an Anagram...");
    else
         System.out.println("Strings are NOT an Anagram...");
    
  }
}