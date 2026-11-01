import java.util.Scanner;
//AP=2,5,8,11----n;
public class AP {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=s.nextInt();
        for(int i=2;i<=(3*n-1);i=i+3){
            System.out.println(i);
        }
    }
    
}
