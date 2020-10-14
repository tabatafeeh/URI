import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int j = in.nextInt();
		int i = 1;
		double r = 0;

	    for(i = 0; i < j; i++){
	        double x = in.nextDouble();
	        double y = in.nextDouble();
	        if(y == 0){
	            System.out.println("divisao impossivel");
	        }else if(x == 0){
	            System.out.println(x);
	        }else if(y != 0){
                r = x / y;
                System.out.printf("%.1f\n", r);
	        }
	    }
	}
}
