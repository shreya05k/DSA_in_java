import java.util.Scanner;
public class DivisibleBy5or3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=s.nextInt();
        if ((a%5==0) && (a%3==0))
            System.out.println("divisible by 5 and 3");
        else if((a%5==0) && (a%3!=0))
            System.out.println("divisible by 5 but not by 3");
        else if((a%5!=0) && (a%3==0))
            System.out.println("divisible by only 3");
        else
            System.out.println("divisible by not 5 and not by 3");

    }
}
