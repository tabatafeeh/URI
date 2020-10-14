import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                int i = 1, inter = 0, gremio = 0, wi = 0, wg = 0, emp = 0, r = 0;
                for(i = 1; i == i; i++){
                    inter = in.nextInt();
                    gremio = in.nextInt();
                    if(inter > gremio){
                        wi += 1;
                    }else if(gremio > inter){
                        wg += 1;
                    }else if(gremio == inter){
                        emp = emp + 1;
                    }
                    System.out.println("Novo grenal (1-sim 2-nao)");
                    r = in.nextInt();
                    if(r == 2){
                        System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n", i, wi, wg, emp);
                        if(wi > wg){
                            System.out.println("Inter venceu mais");
                        }else if(wg > wi){
                            System.out.println("Gremio venceu mais");                            
                        }else if(wg == wi){
                            System.out.println("Nao houve vencedor");
                        }
                        break;
                    }else if(r != 2 && r != 1){
                        System.out.println("Novo grenal (1-sim 2-nao)");
                        r = in.nextInt();
                        if(r != 2 && r != 1){
                            System.out.println("Novo grenal (1-sim 2-nao)");
                            r = in.nextInt();
                        }
                    }
                }
                
        }
}

