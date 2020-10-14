#include <stdlib.h>
#include <iostream>
#include <string.h>
using namespace std;

int main(){
    char tt[650];
    int tamanho = 0;

    scanf("%[^\n]s", &tt);

    tamanho  = strlen(tt);

    if(tamanho <= 140){
        cout << "TWEET" << endl;
    }else if(tamanho > 140){
        cout << "MUTE" << endl;
    }
    
    return 0;
}