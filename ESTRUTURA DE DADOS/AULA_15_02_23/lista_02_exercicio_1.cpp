#include <iostream>
using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

/*

Dados dois números naturais A e B, calcular o MDC entre A e B através do processo e exemplo:   
•Para A=80  e B=112:1.Dividir o número maior pelo menor: 112 dividido por 80 -> quociente 1 e resto 32;2.Não dando resto zero, dividir o divisor pelo resto da divisão anterior:80 dividido por 32 -> 
quociente 2 e resto 16;3.Prosseguir com as divisões até obter resto zero.32 dividido por 16 ->quociente 2 e resto 0.Portanto, o MDC(80,112) = 16.
*/

int main() {
	
	int a=0, b=0, A=0, B=0, resto=0;
	
	
	cout << "\nInforme os numeros:";
	cin >> a >> b;
	
	A=a;
	B=b;
	
	if(a > b){
		resto=a%b;
	}
	else
	{
		resto=b%a;
	}
	
	while (resto != 0){
		a=b;
		b=resto;
		resto=a%b;
	}
	
	
	cout << "MDC de (" << A << " e "<< B << ") e igual a " << b << ".";
	
	
	
	
		
	return 0;
}
