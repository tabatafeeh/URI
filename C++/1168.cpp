#include <stdlib.h>
#include <iostream>
#include <string.h>
using namespace std;

int main(){
    char vet[110];
    int tamanho = 0, i = 0, j = 0, vezes = 0, soma = 0;
    scanf("%d", &vezes);

    for(j = 0; j < vezes; j++){
        scanf("%s", &vet);
        tamanho  = strlen(vet);
        soma = 0;

        for(i = 0; i < tamanho; i++){
            if(vet[i] == '0'){
                soma += 6;
            }else if(vet[i] == '1'){
                soma += 2;
            }else if(vet[i] == '2'){
                soma += 5;
            }else if(vet[i] == '3'){
                soma += 5;
            }else if(vet[i] == '4'){
                soma += 4;
            }else if(vet[i] == '5'){
                soma += 5;
            }else if(vet[i] == '6'){
                soma += 6;
            }else if(vet[i] == '7'){
                soma += 3;
            }else if(vet[i] == '8'){
                soma += 7;
            }else if(vet[i] == '9'){
                soma += 6;
            }
                                          
            
        }
        printf("%d leds\n", soma);
    }

    
    return 0;
}