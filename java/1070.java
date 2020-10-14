import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int c = num;
		int i = 0;
		if(num % 2 != 0){
		    c = num;
    		for(c = num; i < 6; c+=2, i++){
    		    System.out.println(c);
    		}
		}else{
		    c = num + 1;
		    for(c = num + 1; i < 6; c+=2, i++){
    		    System.out.println(c);
    		}
		}
	}
}
