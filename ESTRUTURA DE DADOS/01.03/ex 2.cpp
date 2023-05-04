#include <iostream>
#include <cstdlib>

using namespace std;

float media (float a, float b, float c, float d){
	
	return ((a+b+c+d)/4);	
	
}

int main(int argc, char** argv) {
	
	float a, b, c, d;
	
	cout << "\nInforme as 4 notas:\n";
	
	cin >> a >> b >> c >> d;
	
	cout << "\nMedia =  "<<media(a,b,c,d)<<".";
	
	return 0;
}
