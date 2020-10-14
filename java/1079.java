import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = 0;
        double[] a = new double[i];
        double[] b = new double[i];
        double[] c = new double[i];
        double[] resp = new double[i];
        
        for(j = 0; j < i; j++){
            a[j] = in.nextDouble();
            b[j] = in.nextDouble();
            c[j] = in.nextDouble();
            resp[j] = ((a[j] * 2) + ( b[j] * 3) + (c[j] * 5)) / 10;
            System.out.printf("%.1f\n", resp[j]);
        
        }
    }
}