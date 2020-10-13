import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, prod;
        
        a = in.nextInt();
        b = in.nextInt();
        prod = a * b;
        System.out.printf("PROD = %d\n", prod);
    }
}