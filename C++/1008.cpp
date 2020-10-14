#include <iostream>

using namespace std;

int main(){
    int num = 0, numh = 0;
    double salh = 0, salt = 0;
    cin >> num;
    cin >> numh;
    cin >> salh;
    salt = salh * numh;
    printf("NUMBER = %d\nSALARY = U$ %.2f\n", num, salt);
}