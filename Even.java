import java.util.Scanner;

public class Even {
    static boolean even(int n)
    {
        return (n % 2==0);
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n=scan.nextInt();
            boolean result=even(n);
            System.out.println("Result = "+result);
        }
    }
}
