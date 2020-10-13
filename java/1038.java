import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cod, qtd;
        double total;
        
        cod = in.nextInt();
        qtd = in.nextInt();
        
        if(cod == 1){
            total = qtd * 4.00;
            System.out.printf("Total: R$ %.2f\n", total);
        }else if(cod == 2){
            total = qtd * 4.50;
            System.out.printf("Total: R$ %.2f\n", total);
        }else if(cod == 3){
            total = qtd * 5.00;
            System.out.printf("Total: R$ %.2f\n", total);
        }else if(cod == 4){
            total = qtd * 2.00;
            System.out.printf("Total: R$ %.2f\n", total);
        }else if(cod == 5){
            total = qtd * 1.50;
            System.out.printf("Total: R$ %.2f\n", total);
        }
    }
}