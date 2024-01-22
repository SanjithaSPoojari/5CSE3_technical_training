import java.util.Scanner;

public class Makes10 {
    static boolean makes10(int a,int b)
    {
        return (a==10 || b==10 ||a+b==10);
    }
    public static void main(String[] args) {
         try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int a=scan.nextInt();
            System.out.println("Enter a second number");
            int b=scan.nextInt();
            boolean result=makes10(a,b);
            System.out.println("Result = "+result);
    }
}
}
