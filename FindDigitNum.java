import java.util.Scanner;
public class FindDigitNum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        int i=0;
        while(num>0){
            num=num/10;
            i++;
        }
        System.out.println(i+"  Digit number");
        

    }
}
