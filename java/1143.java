import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int j = in.nextInt();
		int i = 1, r = 1;

	    for(i = 1; i <= j; i++){
	        r = r * i;
	        System.out.printf("%d ", r);
	        r = r * i;
	        System.out.printf("%d ", r);
	        r = r * i;
	        System.out.printf("%d\n", r);
	        r = 1;
	    }
	}
}
