#include <iostream>
#include<stdlib.h>
	
using namespace std;
/*

Fa�a  um  programa  que  leia  uma  temperatura  em  graus  Cent�grados  e  apresente-a
convertida em graus Fahrenheit.  A f�rmula de convers�o �:  
F = (9 * C + 160) / 5, onde F � a temperatura em Fahrenheit e C em graus Cent�grados. 

*/

	
int main() {  

double c;

cout << "\nInforme a temperatura em C�: ";
cin >> c;

cout << (9*c+160)/5;	   

return 0;
}
