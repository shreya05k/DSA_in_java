import java.util.Scanner;
public class ReverseCountingNum {
   public static void main(String[] ags){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }

   } 
}
