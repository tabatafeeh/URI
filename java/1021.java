import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0, n11 = 0, n12 = 0;
        double fm = in.nextDouble();
    	fm = fm + 0.001;
        
        
        while(fm >= 100.0){
            fm = fm - 100.0;
        n1++;
        }
        while(fm >= 50.0){
            fm -= 50.0;
        n2++;
        }
        while(fm >= 20.0){
            fm -= 20.0;
        n3++;
        }
        while(fm >= 10.0){
            fm -= 10.0;
        n4++;
        }
        while(fm >= 5.0){
            fm -= 5.0;
        n5++;
        }
        while(fm >= 2.0){
            fm -= 2.0;
        n6++;
        }
        while(fm >= 1.0){
            fm -= 1.0;
        n7++;
        }
        while(fm >= 0.50){
            fm -= 0.50;
        n8++;
        }
        while(fm >= 0.25){
            fm -= 0.25;
        n9++;
        }
        while(fm >= 0.10){
            fm -= 0.10;
        n10++;
        }
        while(fm > 0.05){
            fm -= 0.05;
        n11++;
        }
        while(fm > 0.01){
        	fm -= 0.01;
        n12++;
        }

        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", n1);
        System.out.printf("%d nota(s) de R$ 50.00\n", n2);
        System.out.printf("%d nota(s) de R$ 20.00\n", n3);
        System.out.printf("%d nota(s) de R$ 10.00\n", n4);
        System.out.printf("%d nota(s) de R$ 5.00\n", n5);
        System.out.printf("%d nota(s) de R$ 2.00\n", n6);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", n7);
        System.out.printf("%d moeda(s) de R$ 0.50\n", n8);
        System.out.printf("%d moeda(s) de R$ 0.25\n", n9);
        System.out.printf("%d moeda(s) de R$ 0.10\n", n10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", n11);
        System.out.printf("%d moeda(s) de R$ 0.01\n", n12); 
    }
}