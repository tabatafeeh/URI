#include <iostream>

using namespace std;

int main(){
    int a = 0, al = 0, die = 0, gaso = 0;
    loop:
        cin >> a;
        if(a == 1){
            al = al + 1;
            goto loop;
        }else if(a == 2){
            gaso = gaso + 1;
            goto loop;
        }else if(a == 3){
            die = die + 1;
            goto loop;
        }else if(a == 4){
            printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", al, gaso, die);
            return 0;
        }else if(a != 4){
            goto loop;
        }
}