#include <iostream>
#include <stdlib.h>

using namespace std;

/* 

Faça um programa que apresente o total da soma obtido dos cem primeiros números inteiros. 
(1+2+3+4+......+100) 

*/

int main() {	
	
	int i=0, soma=0;
	
	for(i=0; i<=100; i++){
		soma=soma+i;
	}
	
	cout << soma;
	
	return 0;
}
