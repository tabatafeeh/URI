import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hi, hf, d = 0;
        
        hi = in.nextInt();
        hf = in.nextInt();
        
        if(hf <= hi){
            d = (24 - hi) + hf;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", d);
        }else if(hf > hi){
            d = hf - hi;
            System.out.printf("O JOGO DUROU %d HORA(S)\n", d);
        }
    }
}