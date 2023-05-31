#include <stdio.h>
#include <stdlib.h>

float saldo = 1000.0;

void exibirMenu() {
    printf("\n----- Aplicativo Bancário -----\n");
    printf("1. Consultar saldo\n");
    printf("2. Depositar\n");
    printf("3. Sacar\n");
    printf("4. Sair\n");
    printf("------------------------------\n");
    printf("Escolha uma opção: ");
}

void consultarSaldo() {
    printf("Seu saldo atual é: R$ %.2f\n", saldo);
}

void depositar() {
    float valor;
    printf("Digite o valor a ser depositado: R$ ");
    scanf("%f", &valor);

    if (valor > 0) {
        saldo += valor;
        printf("Depósito realizado com sucesso!\n");
    } else {
        printf("Valor inválido!\n");
    }
}

void sacar() {
    float valor;
    printf("Digite o valor a ser sacado: R$ ");
    scanf("%f", &valor);

    if (valor > 0 && valor <= saldo) {
        saldo -= valor;
        printf("Saque realizado com sucesso!\n");
    } else {
        printf("Saldo insuficiente ou valor inválido!\n");
    }
}

int main() {
    int opcao;

    do {
        exibirMenu();
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                consultarSaldo();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                printf("Obrigado por usar nosso aplicativo bancário!\n");
                break;
            default:
                printf("Opção inválida!\n");
                break;
        }
    } while (opcao != 4);

    return 0;
}
