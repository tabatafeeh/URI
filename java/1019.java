import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, h = 0, m = 0;
        
        n = in.nextInt();
        while(n > 59){
            n = n - 60;
        m++;
            if(m == 60){
                h++;
                m = 0;
            }
        }
        System.out.printf("%d:%d:%d\n", h, m, n);
 
    }
}