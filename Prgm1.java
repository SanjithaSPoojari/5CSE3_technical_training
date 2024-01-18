//Program to find a power b if a>b, else find b power a by using only math class

public class Prgm1 {
    public static void main(String[] args) {
        int a=5,b=2;
        System.out.println(Math.pow(Math.max(a,b),Math.min(a, b)));
    }
}
