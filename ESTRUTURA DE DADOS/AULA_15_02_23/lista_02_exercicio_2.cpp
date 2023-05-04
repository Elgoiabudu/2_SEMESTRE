#include <iostream>
#include <stdlib.h>

using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */



/*
Dado  um  número  real  X  e  um  número  natural  K,  calcular  a  potência  X  elevado  a  K através de produtos sucessivos.xk    =  x.x.x.x.  ......  x
Obs: independente do valor de k, para x=0 ou 1 o resultado é imediato, isto é, 0 e 1


*/

int main(int argc, char** argv) {
	
	float x, pot;
	int k, i=1;
	
	cout << "\nInforme o valor da base:";
	cin >> x;
	
	cout << "Informe a Potencia:";
	cin >> k;
	
	
	if(k == 0){
		cout << "\nO produto sucessivo e igual a 1.";
		return 0;
	}	
	else if (x == 0 && k == 0)
	{
		cout << "\nO produto sucessivo e igual a 0.";
		return 0;
	}
	else if(x == 0){
		cout << "\nO produto sucessivo e igual a 0.";
	}	
	else{
		pot=x;	
		for	(i=1; i<k; i++)
		{					
			pot=pot*x;
		}
	}
		cout << pot;
		
	
	
	return 0;
}
