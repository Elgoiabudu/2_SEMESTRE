#include <iostream>
#include <stdlib.h>

using namespace std;

/* Implemente uma função recursiva soma(n) que calcula o somatório dos n primeiros números inteiros. */

int soma (int n){
	if(n == 1){
		return 1;
	}else{
		return n + soma(n-1);
	}
}


int main(int argc, char** argv) {
	int n;
	
	cout << "\nInforme o quantos numeros deseja somar:";
	cin >> n;
	
	cout << soma(n);
}
