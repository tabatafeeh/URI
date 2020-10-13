import java.util.Scanner;
import java.util.Arrays;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        
        int[] vt = {a, b, c};
        Arrays.sort(vt);
        int d = a;
        int e = b;
        int f = c;
        int tres = vt[2];
        int dois = vt[1];
        int um = vt[0];
        System.out.printf("%d\n%d\n%d\n\n", um, dois, tres);
        System.out.printf("%d\n%d\n%d\n", d, e, f);
    }
}