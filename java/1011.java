import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r, vol;
        
        r = in.nextDouble();
        vol = (4.0/3.0) * 3.14159 * (r * r * r);
        System.out.printf("VOLUME = %.3f\n", vol);
    }
}