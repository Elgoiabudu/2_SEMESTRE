#include <iostream>
#include <pilha.h>
#include <stdlib.h>

using namespace std;

/* 

4.ª)  Codifique  um  programa  em  C++  quetransforme  um  número  decimal  em  um  número hexadecimal.  
Dica:  Se  o  resto  for  10,11,12,  13,  14  ou  15,  imprima,  respectivamente, A,B,C,D,E ou F.

*/

int main(int argc, char** argv) {
	
	system("CLS");
	
	struct Pilha P1;
	
	IniPilha(&P1);
	
	int x,z,w;
	cout << "Digite um numero inteiro decimal:" <<endl;
	cin >> x;
	z = x % 16;		 //resto da divisão
	w = x / 16;		//inteiro da divisão
	Push(&P1,z);	//empilha o resto
	
	while (w != 0)    //inteiro da divisão
	{
	x = w;
	z = x % 16;
	w = x / 16;
	Push(&P1, z);
	}
	
	while (! pilhavazia(&P1))
	{
	x = Pop(&P1);
	
		switch (x)
		{
			case 10:
				cout << "A";
				break;
			case 11:
				cout << "B";
				break;
			case 12:
				cout << "C";
				break;
			case 13:
				cout << "D";
				break;
			case 14:
				cout << "E";
				break;
			case 15:
				cout << "F";
				break;
			default:
				cout << x;
		}
	}
	
	cout << endl;
	
	return 0;
	
	
	}
	
	
