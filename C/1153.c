#include <stdio.h>


int main(){
    int r = 1, num = 0, i = 1;
    scanf("%d", &num);
    for(i = 1; i <= num; i++){
        r = i * r;    
    }
    printf("%d\n", r);
    return 0;
}