package fellowship_programs;

import java.util.Scanner;
class Vending_machine {
  static int i,money,calnotes,rem,total;
  static int a[]={1000,500,100,50,10,5,2,1};
  public static int cal(int m,int arr[])
  {
    if(money==0)
    return -1;
    else
    {
      if(money>=a[i])
      {
        calnotes=money/a[i];
        rem=money%a[i];
        money=rem;
        total+=calnotes;
        System.out.println(a[i]+" notes are ----->"+calnotes);
      }
      i++;
      
      return cal(money,a);
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Amount...");
    money=sc.nextInt();
    cal(money,a);
    System.out.println("Total number of notes are ----> "+total);

  }
}