#include <iostream>
using namespace std;

int main(){
    int i = 1, r = 0, num = 0;
    cin >> num;
    for(i = 1; i <= num; i++){
        r = num % i;
        if(r == 0){
            cout << i << endl;
        }
    }
    return 0;
}