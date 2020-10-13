import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, num1, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0;
        
        num = in.nextInt();
        num1 = num;
        
        while(num >= 100){
            num = num - 100;
        n1++;
        }
        while(num >= 50){
            num = num - 50;
        n2++;
        }
        while(num >= 20){
            num = num - 20;
        n3++;
        }
        while(num >= 10){
            num = num - 10;
        n4++;
        }
        while(num >= 5){
            num = num - 5;
        n5++;
        }
        while(num >= 2){
            num = num - 2;
        n6++;
        }
        while(num >= 1){
            num = num - 1;
        n7++;
        }
        System.out.printf("%d\n", num1);
        System.out.printf("%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n", n1, n2, n3, n4, n5, n6, n7);
        
    }
}