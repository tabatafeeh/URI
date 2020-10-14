import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = 0, b = 0, c = 0, a = 0, j = 0;
        int r = 0;
        int v = in.nextInt();
        for(i = b, j = 0; j < v; i++, j++){
            a = in.nextInt();
            b = in.nextInt();
            if(b > a){
        		    c = b;
        		    b = a;
        		    a = c;
        	}
            for(i = (b + 1); i < a; i++){
                if(i % 2 != 0){
                    r = i + r;
                }
            }
            System.out.println(r);
            r = 0;
        }
    }
}