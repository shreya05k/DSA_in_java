import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=s.nextInt();
        if(a<0)
            System.out.println(" Absolute value is:" + (-a));
        else
            System.out.println("Absolute value is:" + a);
    }
}
