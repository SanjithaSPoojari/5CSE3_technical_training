import java.util.Scanner;

public class Sum {
    static int sumDouble(int a,int b)
    {
        int sum=a+b;
        return (a==b)? 2*sum:sum;
    }
    public static void main(String[] args) {
         try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int a=scan.nextInt();
            System.out.println("Enter a second number");
            int b=scan.nextInt();
            int result=sumDouble(a,b);
            System.out.println("Sum = "+result);
        }
    }
}
