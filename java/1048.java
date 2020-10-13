import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sal, newS, pct;
        
        sal = in.nextDouble();
        
        if(sal >= 0 && sal <= 400.00){
            pct = (sal / 100) * 15;
            newS = sal + pct;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", newS, pct, 15);
            
        }else if(sal >= 400.01 && sal <= 800.00){
            pct = (sal / 100) * 12;
            newS = sal + pct;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", newS, pct, 12);
            
        }else if(sal >= 800.01 && sal <= 1200.00){
            pct = (sal / 100) * 10;
            newS = sal + pct;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", newS, pct, 10);
            
        }else if(sal >= 1200.01 && sal <= 2000.00){
            pct = (sal / 100) * 7;
            newS = sal + pct;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", newS, pct, 7);
            
        }else if(sal > 2000.00){
            pct = (sal / 100) * 4;
            newS = sal + pct;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", newS, pct, 4);
            
        }
    }
}