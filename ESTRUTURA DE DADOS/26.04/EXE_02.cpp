#include <iostream>
using namespace std;

void imprimirBinario(int n) {
    if (n <= 1) {
        cout << n;
    }
    else {
        imprimirBinario(n / 2);
        cout << n % 2;
    }
}

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int num;
	
	cout << "\nInforme um numero:";
	cin >> num;
	imprimirBinario(num);
}
