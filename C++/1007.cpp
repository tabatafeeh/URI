#include <iostream>
 
using namespace std;
 
int main() {
    int a = 0, b = 0, c = 0, d = 0, dif = 0;
    
    cin >> a;
    cin >> b;
    cin >> c;
    cin >> d;
    dif = (a * b - c * d);
    printf("DIFERENCA = %d\n", dif);
    return 0;
}