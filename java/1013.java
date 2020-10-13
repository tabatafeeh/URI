import java.util.Scanner;
public class Main{
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, c, maiorAB, maiorAC, maior;
        
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maiorAC = (a + c + Math.abs(a - c)) / 2;
        maior = (maiorAB + maiorAC + Math.abs(maiorAB - maiorAC)) / 2;
        System.out.println(maior +" eh o maior");
    }
}