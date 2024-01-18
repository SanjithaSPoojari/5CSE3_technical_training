import java.util.Scanner;

public class GreenLottery {
    static void greenTicket(int a,int b, int c)
    {
        if(a!=b&&b!=c&&c!=a)
            System.out.println("result=0");
        else if(a==b&&b==c&&c==a)
            System.out.println("result=20");
        else
            System.out.println("result=10");
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a,b,c;
            a=scan.nextInt();
            b=scan.nextInt();
            c=scan.nextInt();
            greenTicket(a,b,c);
        }
    }
}
