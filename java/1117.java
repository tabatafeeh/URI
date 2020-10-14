import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                double nota1 = 0, nota2 = 0, entrada = 0, media = 0;
                int i = 0;
                for(i = 0; i == i; i++){
                    entrada = in.nextDouble();
                    if(entrada >= 0 && entrada <= 10.0){
                        if(nota1 == 0){
                            nota1 = entrada;
                        }else{
                            nota2 = entrada;
                            break;
                        }
                    }else{
                        System.out.println("nota invalida");
                    }
                }
                media = (nota1 + nota2) / 2;
                System.out.printf("media = %.2f\n", media);
        }
}

