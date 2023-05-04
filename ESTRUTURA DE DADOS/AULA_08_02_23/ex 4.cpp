#include <iostream>
#include<stdlib.h>

using namespace std;

/* 

Faça um programa que leia 5 valores e informe o valor do maior. 

*/

int main() {
	
	int i=0, num=0, maior=0;
	
	for(i=0; i<5; i++)
	{
		cout << "\nInforme um numero: ";
		cin >> num;
		
		if(num > maior)
		{
			maior=num;
		}
	}
	
	cout << "\nO maior numero informado foi o " << maior;
	return 0;
}
