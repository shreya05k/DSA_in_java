import java.util.Scanner;
public class SideOfTriangle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("side1:");
        int a=s.nextInt();
        System.out.println("side2:");
        int b=s.nextInt();
        System.out.println("side3:");
        int c=s.nextInt();
        if((a+b>c)&&(b+c>a)&&(a+c>b)){
            System.out.println("The sides form a valid triangle ");

        }
        else
            System.out.println("The sides cannot form a valid triangle");

    }
}
