import java.util.Scanner;

public class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            double nota1 = 0, nota2 = 0, entrada = 0, media = 0;
            int i = 0, r = 0;
            for(i = 0; i == i; i++){
                entrada = in.nextDouble();
                if(entrada > 0 && entrada <= 10.0){
                    if(nota1 == 0){
                        nota1 = entrada;
                    }else{
                        nota2 = entrada;
                        media = (nota1 + nota2) / 2;
                        System.out.printf("media = %.2f\n", media);
                        System.out.println("novo calculo (1-sim 2-nao)");
                        r = in.nextInt();
                        nota1 = 0;
                        nota2 = 0;
                        if(r == 2){
                            break;
                        }else if(r != 1 && r != 2){
                            System.out.println("novo calculo (1-sim 2-nao)");
                            r = in.nextInt();
                            if(r == 2){
                                break;
                            }else if(r != 1 && r != 2){
                                System.out.println("novo calculo (1-sim 2-nao)");
                                r = in.nextInt();
                                if(r == 2){
                                    break;
                                }
                            }
                            nota1 = 0;
                            nota2 = 0;
                        }
                    }
                }else{
                    System.out.println("nota invalida");
                }
            }
        }
}

