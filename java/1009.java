import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n;
        double sf, tv, t;
        
        n = in.next();
        sf = in.nextDouble();
        tv = in.nextDouble();
        t = tv / 100 * 15 + sf;
        System.out.printf("TOTAL = R$ %.2f\n", t);
    }
}