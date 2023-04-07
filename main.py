import random

cartas = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H']


tabuleiro = cartas + cartas

random.shuffle(tabuleiro)

cartas_adivinhadas = []

# Função para exibir o tabuleiro atual
def exibir_tabuleiro():
    for i in range(len(tabuleiro)):
        if i in cartas_adivinhadas:
            print(tabuleiro[i], end=' ')
        else:
            print('*', end=' ')
        if (i + 1) % 4 == 0:
            print()

# Loop principal do jogo
while True:
    exibir_tabuleiro()
    print('Digite a posição da primeira carta (1-8): ')
    posicao1 = int(input()) - 1
    cartas_adivinhadas.append(posicao1)

    exibir_tabuleiro()
    print('Digite a posição da segunda carta (1-8): ')
    posicao2 = int(input()) - 1
    cartas_adivinhadas.append(posicao2)

    if tabuleiro[posicao1] == tabuleiro[posicao2]:
        print('Parabéns, você encontrou um par!')
    else:
        print('As cartas não são iguais, tente novamente.')
        cartas_adivinhadas.remove(posicao1)
        cartas_adivinhadas.remove(posicao2)

    if len(cartas_adivinhadas) == len(tabuleiro):
        print('Você ganhou o jogo!')
        break
