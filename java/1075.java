import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0, aux = 0;
		int n = in.nextInt();
		int[] a = new int[n];
		for(i = 0; i < 10000; i++){
		    if(i % n == 2){
		        System.out.println(i);
		    }
		}
	}
}
