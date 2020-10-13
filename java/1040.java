import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1 = in.nextFloat();
        float n2 = in.nextFloat();
        float n3 = in.nextFloat();
        float n4 = in.nextFloat();
        float media, ex;
        
        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media: %.1f\n", media);
        
        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if(media < 5){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno em exame.");
            ex = in.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", ex);
            media = (media + ex) / 2;
            if(media >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", media);
            }
        }
    }
}