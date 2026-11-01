import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your selling price:");
        int sp=s.nextInt();
        System.out.println("Enter your cost price:");
        int cp=s.nextInt();
        if((sp-cp)>0)
            System.out.println("Seller has made profit is:"+(sp-cp));
        else if(sp==cp)
            System.out.println("seller has no profit no loss");
        else
            System.out.println("seller has incurred loss is:"+(cp-sp));
    }   
}
