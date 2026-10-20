import java.util.Scanner;
public class TernaryEvenOdd {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        System.out.println((n%2==0)? n+" is Even": n+" is Odd");
    }
    
}
