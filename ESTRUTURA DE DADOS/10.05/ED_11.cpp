#include <iostream>

using namespace std;

// Definição da estrutura Nó
struct Node {
    int data;
    Node* next;
};

// Definição da classe Fila
class Queue {
private:
    Node* front;
    Node* rear;
public:
    Queue() {
        front = 0;
        rear = 0;
    }

    // Função para inserir um elemento na fila
    void enqueue(int value) {
        Node* newNode = new Node;
        newNode->data = value;
        newNode->next = 0;
        if (front == 0) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear->next = newNode;
            rear = newNode;
        }
        cout << "Elemento inserido: " << value << endl;
        system("pause");
    }

    // Função para remover um elemento da fila
    void dequeue() {
        if (front == 0) {
            cout << "A Fila está vazia." << endl;            
            return;
        }
        Node* temp = front;
        front = front->next;
        if (front == 0) {
            rear = 0;
        }
        int value = temp->data;
        delete temp;
        cout << "Elemento removido: " << value << endl;
        system("pause");
    }

    // Função para imprimir a fila
    void print() {
        if (front == 0) {
            cout << "A Fila está vazia." << endl;            
            return;
        }
        Node* temp = front;
        cout << "Elementos da Fila: [ ";
        while (temp != 0) {
            cout << temp->data << " ";
            temp = temp->next;
        }        
        cout <<"]" << endl;
    }
};

int main() {
    Queue fila;
    int opcao, valor;
    do {
    	system("cls");
    	setlocale(LC_ALL,"");    	
        cout << "MENU PRINCIPAL" << endl;
        cout << "(1) - Insere um elemento na Fila" << endl;
        cout << "(2) - Remove um elemento da Fila" << endl;
        cout << "(3) - Imprime a Fila" << endl;
        cout << "(4) - Sair" << endl;
        cout << "Escolha uma opção: ";
        cin >> opcao;
        switch (opcao) {
            case 1:
                cout << "Digite o valor a ser inserido: ";
                cin >> valor;
                fila.enqueue(valor);                
                break;
            case 2:
                fila.dequeue();
                system("pause");
                break;
            case 3:
                fila.print();
                system("pause");
                break;
            case 4:
                cout << "Saindo..." << endl;
                system("pause");
                break;
            default:
                cout << "Opção inválida." << endl;
                system("pause");
                break;
        }
    } while (opcao != 4);
    return 0;
}

