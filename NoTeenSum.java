import java.util.Scanner;

public class NoTeenSum {
    static int noTeenSum(int a,int b,int c)
    {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }

    static int fixTeen(int n)
    {
        if((n>=13 && n<=14)||(n>=17 && n<=19))
            return 0;
        else
            return n;
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter 3 numbers");
                int a=scan.nextInt();
                int b=scan.nextInt();
                int c=scan.nextInt();
                int result=noTeenSum(a,b,c);
                System.out.println(result);
        }
    }
}
