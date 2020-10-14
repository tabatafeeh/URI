import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int b = 0, a = 0, i = 0;

	    for(i = 0; i == i; i++){
	        a = in.nextInt();
	        b = in.nextInt();
    	    if(b > a){
    		    System.out.println("Crescente");
    		}else if(b < a){
    		    System.out.println("Decrescente");
    		}else if(b == a){
                break;
    		}
	    }
	}
}
