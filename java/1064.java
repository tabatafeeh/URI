import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		double a1 = 0, b1 = 0, c1 = 0, d1 = 0, e1 = 0, f1 = 0, s = 0;
		int i = 0;
		
		if(a > 0){
		    i++;
		    a1 = a;
		}
	    if(b > 0){
	        i++;
	        b1 = b;
	    }
        if(c > 0){
            i++;
            c1 = c;
        }
        if(d > 0){
            i++;
            d1 = d;
        }
        if(e > 0){
            i++;
            e1 = e;
        }
        if(f > 0){
            i++;
            f1 = f;
        }
        System.out.printf("%d valores positivos\n", i);
        s = (a1 + b1 + c1 + d1 + e1 + f1) / i;
        System.out.printf("%.1f\n", s);
	}
}
