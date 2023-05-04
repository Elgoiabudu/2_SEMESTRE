#include <iostream>

using namespace std;

int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

int main(int argc, char** argv) {
	
	int num;
	
	cout << "\nSequencia Fibonacci!";
	cout <<"\n";
	cout << "Informe qual o termo deseja saber da sequencia:";
	cin >> num;
	cout << fibonacci(num);
}
