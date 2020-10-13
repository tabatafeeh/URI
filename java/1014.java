import java.util.Scanner;
public class Main{
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double l, total;
        int km;
        
        km = in.nextInt();
        l = in.nextDouble();
        total = km / l;
        System.out.printf("%.3f km/l\n", total);
    }
}