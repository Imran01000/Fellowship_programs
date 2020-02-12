package fellowship_programs;

import java.util.Random;
import java.util.Scanner;
class Flp_coin {
  public static void main(String[] args) {
    int heads=1;
    int tails=0;
    int countheads=0;
    int counttails=0;
    float perofhead,peroftail;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rounds");
    int n=sc.nextInt();
    Random r=new Random();
    for(int i=0;i<n;i++)
    {
      int value=r.nextInt(2);
      if(value==heads)
      countheads++;
      else
      counttails++;


    }
    perofhead=(float)countheads/n;
    peroftail=(float)counttails/n;
    System.out.println("Heads are "+countheads+" times");
    System.out.println("Tails are "+counttails+" times");
    System.out.println("The percentage of heads and tails are "+perofhead+" and "+peroftail);
  }
}