import java.util.Scanner;
public class CheckInteger {
 public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number:");
    double n = s.nextDouble();
    int a=(int)n;
    if((n-a)>0)
        System.out.println("Given number is not integer");
    else
        System.out.println("Given number is integer");


 }  
}
