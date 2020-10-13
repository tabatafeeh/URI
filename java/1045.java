import java.util.Scanner;
import java.util.Arrays;
public class Main {
 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = 0, b = 0, c = 0, aux = 0;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        
        if(b >= a){
            aux = a;
            a = b;
            b = aux;
            if(c >= a){
                aux = a;
                a = c;
                c = aux;
            }
        }

        if(a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        }else if(a * a == (b * b) + (c * c)){
            System.out.println("TRIANGULO RETANGULO");
            if(a == b && a == c){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(a == b && a != c || a == c && a != b || b == c && b != a){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }else if(a * a > (b * b) + (c * c)){
            System.out.println("TRIANGULO OBTUSANGULO");
            if(a == b && a == c){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(a == b && a != c || a == c && a != b || b == c && b != a){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }else if(a * a < (b * b) + (c * c)){
            System.out.println("TRIANGULO ACUTANGULO");
            if(a == b && a == c){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(a == b && a != c || a == c && a != b || b == c && b != a){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}