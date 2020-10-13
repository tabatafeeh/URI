import java.util.Scanner;
public class Main{
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a, b, c, tri, circ, trap, quad, ret;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        tri = (a * c) / 2;
        circ = 3.14159 * (c * c);
        trap = ((a + b) / 2) * c;
        quad = b * b;
        ret = b * a;
        System.out.printf("TRIANGULO: %.3f\n", tri);
        System.out.printf("CIRCULO: %.3f\n", circ);
        System.out.printf("TRAPEZIO: %.3f\n", trap);
        System.out.printf("QUADRADO: %.3f\n", quad);
        System.out.printf("RETANGULO: %.3f\n", ret);
    }
}