#include <iostream>

using namespace std;

int potencia(int x, int k) {
    if (k == 0) {
        return 1;
    }
    return x * potencia(x, k - 1);
}

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	int x, k;    
	cout << "\nDigite um numero inteiro X: ";
    cin >> x;
    cout << "\nDigite um número natural K: ";
    cin >> k;
    cout << x << " elevado a " << k << " e igual a " << potencia(x, k) << endl;
    return 0;
}
