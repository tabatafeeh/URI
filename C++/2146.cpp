#include <iostream>
 
using namespace std;
 
int main() {
    int senha = 0, r = 0, i = 0;
    for(i = 0; i <= 9999; i = i){
        cin >> senha;
        r = senha - 1;
        cout << r << endl;
        if(senha == 9999)
            break;
    }
 
    return 0;
}