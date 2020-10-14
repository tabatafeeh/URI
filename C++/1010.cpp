#include <iostream>
 
using namespace std;
 
int main() {
    double c = 0, f = 0, tot1 = 0, tot = 0;
    int a = 0, b = 0, d = 0, e = 0;
    cin >> a >> b >> c;
    tot = b * c;
    cin >> d >> e >> f;
    tot1 = e * f;
    printf("VALOR A PAGAR: R$ %.2f\n", (tot + tot1));
    return 0;
}