import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = 1, r = 0, num = 0;
        num = in.nextInt();
        for(i = 1, r = 0; i <= num; i++){
            r = num % i;
            if(r == 0){
                System.out.println(i);
            }
        }
    }
}