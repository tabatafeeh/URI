import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hi, min, hf, mf, dh = 0, dm1 = 0, dm2 = 0, dmt = 0;
        
        hi = in.nextInt();
        min = in.nextInt();
        hf = in.nextInt();
        mf = in.nextInt();
        
        if(hi < hf){
            dh = ((hf * 60) - (hi * 60)) / 60;
                if(min < 60){
                dm1 = 60 - min;
                if(mf < 60){
                    dm2 = 0 + mf;
                }
                if(dm2 + dm1 < 60){
                    dmt = (dm2 + dm1);
                    dh--;
                }else if(dm2 + dm1 >= 60){
                    dmt = (dm2 + dm1) - 60;
                    // dh++;
                }
            }
        }else if(hi > hf){
            dh = (24 - hi) + hf;
            if(min <= 60){
                dm1 = 60 - min;                
                if(mf < 60){
                    dm2 = 0 + mf;
                }
                if(dm2 + dm1 < 60){
                    dmt = (dm2 + dm1);
                    dh--;
                }else if(dm2 + dm1 >= 60){
                    dmt = (dm2 + dm1) - 60;
                }
                
            }
        }else if(hi == hf){
            // dh = hf;
            if(min <= 60){
                dm1 = 60 - min;                
                if(mf < 60){
                    dm2 = 0 + mf;
                }
                if(dm2 + dm1 < 60){
                    dmt = (dm2 + dm1);
                    dh--;
                }else if(dm2 + dm1 >= 60){
                    dmt = (dm2 + dm1) - 60;
                }
                if(dmt == 0){
                    dh = (24 - hi) + hf;
                }else{
                    dh = 0;
                }
            }
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", dh, dmt);
    }
}
