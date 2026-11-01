import java.util.Scanner;
public class GreaterOfNum {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=s.nextInt();
        System.out.println("ENter second number:");
        int b=s.nextInt();
        System.out.println("Enter third number:");
        int c=s.nextInt();
        if(a>b){
            if(a>c)
                System.out.println(a+" is greatest of them");
            else
                System.out.println(c+" is greatest of them");

        }   
        else
            if(b>c)
                System.out.println(b+"is greatest of them");

            else
                System.out.println(c+" is greatest of them");

    }    
}
