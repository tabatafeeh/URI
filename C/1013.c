#include <stdio.h>

int main(){
    int a, b, c, maiorAB, maior;
    
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    maiorAB = (a + b + abs(a - b)) / 2;
    maior = (maiorAB + c + abs(maiorAB - c)) / 2;
    printf("%d eh o maior\n", maior);
    return 0;
}
