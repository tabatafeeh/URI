import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1, aux = 0;
		int n = in.nextInt();
		int[] a = new int[n];
		for(i = 1; i <= 10; i++){
		    int r = i * n;
		    System.out.printf("%d x %d = %d\n", i, n, r);
		}
	}
}