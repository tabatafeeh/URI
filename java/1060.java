import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		int i = 0;
		
		if(a > 0){
		    i++;
		}
	    if(b > 0){
	        i++;
	    }
        if(c > 0){
            i++;
        }
        if(d > 0){
            i++;
        }
        if(e > 0){
            i++;
        }
        if(f > 0){
            i++;
        }
        System.out.printf("%d valores positivos\n", i);
	}
}
