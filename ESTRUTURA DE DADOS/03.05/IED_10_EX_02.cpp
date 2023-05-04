#include <iostream>
#include <stdlib.h>

using namespace std;

/* 
Pode-se calcular o quociente da divisão, DIV, de x por y, dois números inteiros, usando-se a seguinte definição:
1 + DIV(x-y,y) se x>y
= 0 se x<y
1 se x=y

Então, pede-se que seja criada uma função recursiva para descrever tal definição. A função deve retornar -1 caso não seja possível realizar o cálculo. 
Além disso, crie um algoritmo que leia os dois valores inteiros e utilize a função criada para calcular o quociente de x por y, e imprima o valor computado.

*/


int DIV(int x, int y){
	if(y == 0){
		
		return -1;
		
	}else if(x > y){
		
		return 1+DIV(x-y, y);
		
	}else if(x<y){
		
		return 0;
		
	}else if(x== y){
		
		return 1;
		
	}
	
	
}

int main(int argc, char** argv) {
	
	int x, y;
	
	cout << "\nInforme o valor de x:";
	cin >> x;
	
	cout << "\nInforme o valor de y:";
	cin >> y;
	
	cout << DIV(x,y);
	
}
