#include <iostream>
#include <stdlib.h>




using namespace std;

/* run this program using the console pauser or add your own getch, system("pause") or input loop */



/*
Efetuar  o  cálculo  da  quantidade  de  litros  de  combustível  gastos  em  uma  viagem, utilizando-se  um  automóvel  que  faz  “x”    km/l.  
Para  obter  o  cálculo,  o  usuário  deverá fornecer o tempo gasto na viagem e a velocidade média durante a mesma. Desta forma será possível   
obter a   distância   percorrida   com   a   fórmula:   DISTÂNCIA=   TEMPO   * VELOCIDADE  (utilizar  uma  função).  
Tendo  o  valor  da  distância,  basta  calcular  a quantidade    de    litros    de    combustível    utilizada    na    viagem    com    a    fórmula:  LITROS_USADOS=DISTÂNCIA / “x” (através de função). 
O programa deverá apresentar os  valores  da  velocidade  média,  tempo  gasto  na  viagem,  a  distância  percorrida  e  a quantidade de litros utilizada na viagem.
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
