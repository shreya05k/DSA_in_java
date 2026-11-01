import java.util.Scanner;
public class DivisibleBy5 {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a integer:");
    int num =s.nextInt();
    if(num%5==0)
      System.out.println("Divisible by 5");
    else
      System.out.println("Not divisible by 5");
  }
}
