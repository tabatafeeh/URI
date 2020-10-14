import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        double c = 0, r = 0, s = 0, tot = 0;
        double pc, pr, ps;
        int num = in.nextInt();
        int i = 0;
        for(i = 0; i < num; i++){
            int n = in.nextInt();
            String letra = in.next();
            if(letra.equals("C")){
                c = n + c;
            }else if(letra.equals("R")){
                r = n + r;
            }else if(letra.equals("S")){
                s = n + s;
            }
        }
        tot = c + r + s;
        pc = (100 * c) / tot;
        pr = (r * 100) / tot;
        ps = (s * 100) / tot;
        System.out.printf("Total: %.0f cobaias\nTotal de coelhos: %.0f\nTotal de ratos: %.0f\nTotal de sapos: %.0f\nPercentual de coelhos: %.2f %%\nPercentual de ratos: %.2f %%\nPercentual de sapos: %.2f %%\n", tot, c, r, s, pc, pr, ps);
    }
}