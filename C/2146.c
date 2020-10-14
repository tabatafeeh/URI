#include <stdio.h>

int main() {
    int senha = 0, r = 0, i = 0;
    for(i = 0; i <= 9999; i = i){
        scanf("%d", &senha);
        r = senha - 1;
        printf("%d\n", r);
        if(senha == 9999)
            break;
    }
 
    return 0;
}