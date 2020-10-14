import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 2;
		int n = in.nextInt();
		if(n % 2 ==0)
		    n++;
		int[] a = new int[n];
		if(n % 2 != 0){
    		for(i = 2; i < a.length; i += 2){
    		    a[i] = i;
    		    System.out.printf("%d^2 = %d\n", a[i], (a[i] * a[i]));
    		} 
		}
	}
}
