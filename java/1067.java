import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i = 1;
		for(i = 1; i <= num; i+=2){
		    System.out.println(i);
		}
	}
}
