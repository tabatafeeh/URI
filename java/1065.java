import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int a, b, c, d, e, i = 0;
		a = in.nextInt();
	    b = in.nextInt();
	    c = in.nextInt();
	    d = in.nextInt();
	    e = in.nextInt();

		if(a % 2 == 0){
		    i++;
		}
	    if(b % 2 == 0){
	        i++;
	    }
        if(c % 2 == 0){
            i++;
        }
        if(d % 2 == 0){
            i++;
        }
        if(e % 2 == 0){
            i++;
        }
        System.out.printf("%d valores pares\n", i);
	}
}