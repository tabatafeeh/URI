import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = 0;
        for(i = 0; i == i; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            if(x < 0 && y < 0){
                System.out.println("terceiro");
            }else if(x > 0 && y > 0){
                System.out.println("primeiro");
            }else if(x < 0 && y > 0){
                System.out.println("segundo");
            }else if(x > 0 && y < 0){
                System.out.println("quarto");
            }else if(x == 0 || y == 0){
                break;
            }
        }
    }
}