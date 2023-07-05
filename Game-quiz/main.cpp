#include <iostream>
#include <cstdlib>
#include <ctime>
#include <limits>

int main() {
    std::srand(static_cast<unsigned int>(std::time(nullptr)));

    int numeroSecreto = std::rand() % 100 + 1;

    int palpite;
    int tentativas = 0;

    std::cout << "Bem-vindo ao jogo de adivinhação!\n";
    std::cout << "Tente adivinhar o número secreto entre 1 e 100.\n";

    do {
        std::cout << "Digite seu palpite: ";
        std::cin >> palpite;
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');

        ++tentativas;

        if (palpite > numeroSecreto) {
            std::cout << "Palpite muito alto!\n";
        } else if (palpite < numeroSecreto) {
            std::cout << "Palpite muito baixo!\n";
        } else {
            std::cout << "Parabéns! Você acertou o número secreto em " << tentativas << " tentativa(s).\n";
        }
    } while (palpite != numeroSecreto);

    return 0;
}
