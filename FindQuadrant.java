import java.util.Scanner;
public class FindQuadrant {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x-coordinate");
        double x=s.nextDouble();
        System.out.println("Enter y-coordinate");
        double y=s.nextDouble();
        if((x>0) && (y>0))
            System.out.println("1st Quadrant");
        else if((x>0) && (y<0))
            System.out.println("2nd Quadrant");
        else if((x<0) && (y>0))
            System.out.println("3rd Quadrant");
        else if((x<0) && (y<0))
            System.out.println("4th Quadrant");
        else
            System.out.println("Origin");
    }    
}
