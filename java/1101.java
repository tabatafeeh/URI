import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0, b = 0, c = 0, r = 0;
		
		for(a = a; a == a; a++){
		    a = in.nextInt();
		    b = in.nextInt();
		    if(a > b){
		       c = a;
		       a = b;
		       b = c;
		    }
		    if(a <= 0 || b <= 0){
		        break;
		    }
		    for(a = a; a <= b; a++){
    		    r = a + r;
    		    System.out.printf("%d ", a);
    		    if(a == b){
    		        System.out.printf("Sum=%d\n", r);
    		        r = 0;
    		    }
		    }
		}
	}
}
