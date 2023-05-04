#include <iostream>
#include<stdlib.h>
	
using namespace std;
/*

Faça  um  programa  que  leia  uma  temperatura  em  graus  Centígrados  e  apresente-a
convertida em graus Fahrenheit.  A fórmula de conversão é:  
F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C em graus Centígrados. 

*/

	
int main() {  

double c;

cout << "\nInforme a temperatura em C°: ";
cin >> c;

cout << (9*c+160)/5;	   

return 0;
}
