#include <iostream>
 
using namespace std;
 
int main() {
    double a = 0, b = 0, media = 0;
    
    cin >> a;
    cin >> b;
    media = ((a * 3.5) + (b * 7.5)) / 11;
    printf("MEDIA = %.5f\n", media);
    return 0;
}