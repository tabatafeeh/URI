import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        
        double raio, area;
        
        raio = in.nextDouble();
        area = 3.14159 * (raio * raio);
        System.out.printf("A=%.4f\n", area);
        
    }
}