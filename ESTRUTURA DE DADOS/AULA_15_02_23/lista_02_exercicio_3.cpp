#include <iostream>
#include <stdlib.h>




using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */



/*
Efetuar  o  c�lculo  da  quantidade  de  litros  de  combust�vel  gastos  em  uma  viagem, utilizando-se  um  autom�vel  que  faz  �x�    km/l.  
Para  obter  o  c�lculo,  o  usu�rio  dever� fornecer o tempo gasto na viagem e a velocidade m�dia durante a mesma. Desta forma ser� poss�vel   
obter a   dist�ncia   percorrida   com   a   f�rmula:   DIST�NCIA=   TEMPO   * VELOCIDADE  (utilizar  uma  fun��o).  
Tendo  o  valor  da  dist�ncia,  basta  calcular  a quantidade    de    litros    de    combust�vel    utilizada    na    viagem    com    a    f�rmula:  LITROS_USADOS=DIST�NCIA / �x� (atrav�s de fun��o). 
O programa dever� apresentar os  valores  da  velocidade  m�dia,  tempo  gasto  na  viagem,  a  dist�ncia  percorrida  e  a quantidade de litros utilizada na viagem.
*/

int main(int argc, char** argv) {
	
	float tempo, vmedia, dist, consumo, consumo_medio;
	
	cout << "\nInforme o consumo medio de seu veiculo:";
	cin >> consumo_medio;
	
	cout << "\nInforme o tempo gasto na viagem:";
	cin >> tempo;
	
	cout << "\nInforme a velocidade media em sua viagem:";
	cin >> vmedia;	
	
	dist = vmedia * tempo;
	
	consumo = dist / consumo_medio;
	
	
	cout <<"\nSua velocidade media foi de: "<<vmedia<<"km/h.";
	cout <<"\nSeu tempo gasto foi de: "<<tempo<<" horas.";
	cout <<"\nA diastancia percorrida foi de : "<<dist<<"km.";
	cout <<"\nSeu consumo total foi de "<<consumo<<" litros.";
	
	
	return 0;
}
