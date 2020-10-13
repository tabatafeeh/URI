import java.util.Scanner;
public class Main{
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, c = 0;
        
        a = in.nextInt();
        b = in.nextInt();
        
        if(a > b){
            c = a;
            a = b;
            b = c;
            if(b % a == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }else if(b % a == 0){
                System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
