import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numF, numH;
        double salH, salF;
        
        numF = in.nextInt();
        numH = in.nextInt();
        salH = in.nextDouble();
        salF = numH * salH;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numF, salF);
    }
}