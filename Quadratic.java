import java.util.Scanner;

public class Quadratic {
    static int a;
    static int b,c;
    static int quadratic()
    {
        float d=((b*b)-(4*a*c));
        double x1=((-b)+(Math.sqrt(d)/(2*a)));
        double x2=((-b)-(Math.sqrt(d)/(2*a)));
        System.out.println(x1);
        System.out.println(x2);
        if(d==0)
        {
            System.out.println("Real and equal roots");
        }
        else if(d>0)
        {
            System.out.println("Real and distict roots");
        }
        else
        {
            System.out.println("Imaginary roots");
        }
        return 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
        }
        quadratic();
    }
}
