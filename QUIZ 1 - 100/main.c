#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int numero_secreto, palpite, tentativas = 0;
    srand(time(0));
    numero_secreto = rand() % 100 + 1; // Gera um número aleatório entre 1 e 100

    printf("Bem-vindo ao Jogo de Adivinhação!\n");
    printf("Tente adivinhar o número secreto entre 1 e 100.\n");

    while (1) {
        printf("Digite seu palpite: ");
        scanf("%d", &palpite);
        tentativas++;

        if (palpite == numero_secreto) {
            printf("Parabéns, você acertou o número secreto em %d tentativas!\n", tentativas);
            break;
        } else if (palpite < numero_secreto) {
            printf("Tente um número maior.\n");
        } else {
            printf("Tente um número menor.\n");
        }
    }

    return 0;
}
