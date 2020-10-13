import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idias, ano = 0, mes = 0, dia = 0;
        
        idias = in.nextInt();
        while(idias > 365){
            idias = idias - 365;
            ano++;
        }
        while(idias > 29){
            idias -= 30;
            mes++;
        }
        while(idias > 0){
            idias -= 1;
            dia++;
        }
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
 
    }
}