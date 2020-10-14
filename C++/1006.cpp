#include <iostream>
 
using namespace std;
 
int main() {
    double a = 0, b = 0, c = 0, media = 0;
    
    cin >> a;
    cin >> b;
    cin >> c;
    media = ((a * 2) + (b * 3) + (c * 5)) / 10;
    printf("MEDIA = %.1f\n", media);
    return 0;
}