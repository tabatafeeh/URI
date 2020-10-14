#include <iostream>
using namespace std;

int main(){
    int x = 0, i = 0, j = 0, y = 0;
    for(i = 0; i == i; i++){
        cin >> x;
        if(x == 0){
            break;
        }else{
            for(j = 1; j <= x; j++){
                if(j < x){
                    printf("%d ", j);
                }
                if(j == x){
                    printf("%d\n", j);                        
                }
            }
        }
    }
    return 0;
}