import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0, on = 0, out = 0;
		int x = in.nextInt();
		int[] n = new int[x];
		for(i = 0; i < n.length; i++){
		    n[i] = in.nextInt();
		    if(n[i] >= 0 && n[i] <= 20){
		        on++;
		    }else{
		        out++;
		    }
		}
		System.out.printf("%d in\n%d out\n", on, out);
	}
}