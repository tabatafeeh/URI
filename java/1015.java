import java.util.Scanner;
public class Main{
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.printf("%.4f\n", distancia);
    }
}