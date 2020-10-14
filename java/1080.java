import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0, p = 0;
		int[] a = new int[100];
		int b = a[0];
		for(i = 0; i < a.length; i++){
		    a[i] = in.nextInt();
		}
		for(i = 0; i < a.length; i++){
		    if(a[i] > b){
		        b = a[i];
		        p = i;
		    }
		}
	    System.out.println(b);
	   // int busca = Arrays.binarySearch(a, b);
	    System.out.println(p + 1);
	}
}