#include <stdio.h>

int main(){
    int a, b, d, e;
    float c, tot = 0, f, tot1 = 0;
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%f", &c);
    tot = b * c;
    scanf("%d", &d);
    scanf("%d", &e);
    scanf("%f", &f);
    tot1 = e * f;
    printf("VALOR A PAGAR: R$ %.2f\n", (tot + tot1));
    return 0;
}
