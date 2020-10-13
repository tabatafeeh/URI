import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, delta, r1, r2;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        
        delta = (b * b) - 4 * a * c;
        
        if(delta > 0 && a != 0){
            r1 = (-b + (Math.sqrt(delta))) / (2 * a);
            r2 = (-b - (Math.sqrt(delta))) / (2 * a);
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
        }else{
            System.out.printf("Impossivel calcular\n");
        }
    }
}