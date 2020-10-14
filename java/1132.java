import java.util.Scanner;

public class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int x = 0, y = 0, tot = 0, i, aux = 0;
            x = in.nextInt();
            y = in.nextInt();
            if(x > y){
                aux = y;
                y = x;
                x = aux;
            }
            for(i = x; i <= y; i++){
                if(i % 13 != 0){
                    tot += i;
                }
            }
            System.out.println(tot);
        }
}

