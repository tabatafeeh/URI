#include <iostream>
using namespace std;

int main(){
    int r = 1, num = 0, i = 1;
    cin >> num;
    for(i = 1; i <= num; i++){
        r = i * r;    
    }
    cout << r << endl;
    return 0;
}