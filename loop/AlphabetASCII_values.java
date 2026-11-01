//print all alphabets with their corresponding ASCII values;
public class AlphabetASCII_values {
    public static void main(String[] args){
        int a=32;
        for(int i=65;i<=90;i++){
            int b=a+i;
            System.out.println((char)i+ "-" +i+"  "+(char)b+"-"+b);
        }
    }
}
