import java.util.Scanner;
class CheckEvenOdd{
    public static void main(String[] arg){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a integer");
        int a =s.nextInt();
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}