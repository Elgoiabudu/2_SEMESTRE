#include <iostream>
#include <cstdlib>

using namespace std;

int dobro (int x){
	return(x*2);
}

int main(int argc, char** argv) {
	int a;
	
	system("CLS");
	
	cout << "\nInforme o valor a ser dobrado:";
	cin >> a;
	
	cout << "O dodro e igual a "<<dobro(a);
	
	return 0;
}
