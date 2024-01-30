import java.util.Scanner;

public class PosNeg {
    static void pos(int n)
    {
        if(n==0)
            System.out.println("Already zero");
        else
        {
            for(int i=n-1;i>=0;i--)
            {
                System.out.print(i+" ");
            }
        }
    }
    static void neg(int n)
    {
        for(int i=n;i<=0;i++)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n=scan.nextInt();
            if(n>=0)
                pos(n);
            else
                neg(n);
        }

    }
}
