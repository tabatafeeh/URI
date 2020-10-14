import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int j = in.nextInt();
		int i = 0, t = 0;

	    for(i = 0, t = 0; i < j; i++, t++){
	        System.out.printf("%d %d %d PUM\n", t + 1, t + 2, t + 3);
	        t = t + 3;
	    }
	}
}
