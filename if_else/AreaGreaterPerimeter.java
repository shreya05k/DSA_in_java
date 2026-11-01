import java.util.Scanner;
public class AreaGreaterPerimeter {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Length:");
        int l=s.nextInt();
        System.out.println("Enter Breadth:");
        int b=s.nextInt();
        int area=l*b;
        int perimeter=2*(l+b);
        if(area>perimeter)
            System.out.println("The area of rectangle is greater then perimeter");
        else
            System.out.println("The area of rectangle is not greater then perimeter");
        


    }
}
