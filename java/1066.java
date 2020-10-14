import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int par = 0, impar = 0, n = 0, p = 0, i = 0;
		int[] num = new int[5];
		
		for(i = 0; i < num.length; i++){
		    num[i] = in.nextInt();
		    if(num[i] % 2 == 0){
		        par++;
		    }
		    if(num[i] % 2 != 0){
		        impar++;
		    }
		    if(num[i] < 0){
		        n++;
		    }
		    if(num[i] > 0){
		        p++;
		    }
		}
		System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", par, impar, p, n);
	}
}










