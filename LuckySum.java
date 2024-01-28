import java.util.Scanner;

public class LuckySum {
    static int luckySum(int a,int b,int c)
    {
        if(a==13)
            return 0;
        else if(b==13)
            return a;
        else if(c==13)
            return a+b;
        else
            return a+b+c;
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter 3 numbers");
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();
            int result=luckySum(a,b,c);
            System.out.println(result);
        }
    }
}
