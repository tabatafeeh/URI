#include <iostream>

using namespace std;

int main(){
    int a = 0, b = 0, c = 0, maiorAB = 0, maior = 0;
    cin >> a;
    cin >> b;
    cin >> c;
    maiorAB = (a + b + abs(a - b)) / 2;
    maior = (maiorAB + c + abs(maiorAB - c)) / 2;
    printf("%d eh o maior\n", maior);
    return 0;
}