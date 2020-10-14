import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = 1, r = 1, num = 0;
        num = in.nextInt();
        for(i = 1; i <= num; i++){
            r = r * i;
        }
        System.out.println(r);
    }
}