#include <iostream>

using namespace std;

int mdc(int a, int b) {
    if (b == 0) {
        return a;
    }
    return mdc(b, a % b);
}

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	int a, b;
	
	cout << "\nMDC usando Diagrama de Euclides!";	
    cout << "\nDigite dois números inteiros: ";
    cin >> a >> b;
    cout << "\nO MDC de " << a << " e " << b << " e: " << mdc(a, b) << endl;
    return 0;
}
