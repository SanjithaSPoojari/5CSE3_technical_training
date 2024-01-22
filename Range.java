import java.util.Scanner;
public class Range {
    static boolean in1020(int a,int b)
    {
        return((a>=10 && a<=20) || (b>=10 && b<=20));
    }
    public static void main(String[] args) {
        try(Scanner scan=new Scanner(System.in)){
        System.out.println("Enter first number");
            int a=scan.nextInt();
            System.out.println("Enter a second number");
            int b=scan.nextInt();
            boolean result=in1020(a,b);
            System.out.println("Result = "+result);
    }
}
}



