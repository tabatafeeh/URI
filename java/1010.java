import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cod1, np1, cod2, np2;
        double valor1, valor2, total;
        
        cod1 = in.nextInt();
        np1 = in.nextInt();
        valor1 = in.nextDouble();
        cod2 = in.nextInt();
        np2 = in.nextInt();
        valor2 = in.nextDouble();
        total = (valor1 * np1) + (valor2 * np2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}