import java.util.Scanner;
public class Main{
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int th, kmh;
        double total, lq;
        
        th = in.nextInt();
        kmh = in.nextInt();
        lq = th * kmh;
        total = lq / 12;
        System.out.printf("%.3f\n", total);
 
    }
}