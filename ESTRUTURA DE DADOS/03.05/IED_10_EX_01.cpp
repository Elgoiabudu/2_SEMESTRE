#include <iostream>
#include <stdlib.h>

using namespace std;

/* 

Pode-se calcular o resto da divis�o, MOD, de x por y, dois n�meros inteiros, usando-se a seguinte defini��o: 
MOD(x-y,y) se x>y;
X se x<y;
0 se x=y;

Ent�o, pede-se que seja criada uma fun��o recursiva para descrever tal defini��o. A fun��o deve retornar -1 caso n�o seja poss�vel realizar o c�lculo. 
Al�m disso, crie um algoritmo que leia os dois valores inteiros e utilize a fun��o criada para calcular oresto da divis�o de x por y, e imprima o valor computado.
*/


int MOD(int x, int y){
	
	if(x > y){
		return MOD(x-y, y);
	}else if(x < y){
		return x;
	}else if(x == y){
		return 0;
	}else{
		return -1;
	}
	
}


int main(int argc, char** argv) {
	
	int x, y;
	
	cout << "\nInforme o valor de x:";
	cin >> x;
	cout <<"\nInforme o valor de y:";
	cin >> y;
	
	if(y == 0){
		cout << "\n-1\n" << endl;
	}else{
		cout << MOD(x,y);	
	}	
	
	
	system("pause");
}
