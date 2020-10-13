import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, area, perimetro;
        
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        if(a < b + c && b < c + a && c < b + a){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }else{
            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}