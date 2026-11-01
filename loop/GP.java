import java.util.Scanner;
//GP=1,2,4,8---n;
public class GP {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=s.nextInt();
        int a=1,r=2;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=r;
        }
        
    }
    
}
