import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		int n = in.nextInt();
		int[] a = new int[n];
		
		for(i = 0; i < a.length; i++){
		    a[i] = in.nextInt();
		}
		for(i = 0; i < a.length; i++){
		    if(a[i] % 2 == 0 && a[i] != 0){
		        if(a[i] > 0)
		            System.out.println("EVEN POSITIVE");
		        else if(a[i] < 0)
		            System.out.println("EVEN NEGATIVE");
		    }else if(a[i] % 2 != 0){
		        if(a[i] > 0)
		            System.out.println("ODD POSITIVE");
		        else if(a[i] < 0)
		            System.out.println("ODD NEGATIVE");
		    }else if(a[i] == 0){
		        System.out.println("NULL");
		    }
		}
	}
}
