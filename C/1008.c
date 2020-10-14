#include <stdio.h>

int main(){
    int a, b;
    float c, sal = 0;
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%f", &c);
    sal = b * c;
    printf("NUMBER = %d\nSALARY = U$ %.2f\n", a, sal);
    return 0;
}
