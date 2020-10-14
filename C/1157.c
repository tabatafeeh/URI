#include <stdio.h>

int main(){
    int i = 1, r = 0, num = 0;
    scanf("%d", &num);
    for(i = 1; i <= num; i++){
        r = num % i;
        if(r == 0){
            printf("%d\n", i);
        }
    }
    return 0;
}