import java.util.Scanner;
public class MagSmallThan69 {
public static void main(String[] agrs){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number:");
    double a=s.nextDouble();
    double num;
    if(a<0){
        num=(-a);
        if(num>69)
            System.out.println("modulus of "+a+" is greater than 69");
        else
            System.out.println("modulus of "+a+" not greater than 69");

    }
    else
        if(a>69)
            System.out.println(a+" is greater than 69");
        else
            System.out.println(a+" not greater than 69");
    
}    
}
