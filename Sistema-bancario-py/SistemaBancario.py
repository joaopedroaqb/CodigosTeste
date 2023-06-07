class ContaBancaria:
    def __init__(self, nome, numero_conta, saldo=0):
        self.nome = nome
        self.numero_conta = numero_conta
        self.saldo = saldo

    def depositar(self, valor):
        self.saldo += valor
        print("Depósito realizado com sucesso!")

    def sacar(self, valor):
        if valor > self.saldo:
            print("Saldo insuficiente para saque.")
        else:
            self.saldo -= valor
            print("Saque realizado com sucesso!")

    def consultar_saldo(self):
        print(f"Saldo disponível: R$ {self.saldo:.2f}")


def exibir_menu():
    print("======= Sistema Bancário =======")
    print("1. Criar nova conta")
    print("2. Acessar conta existente")
    print("3. Sair")


contas = {}


while True:
    exibir_menu()
    opcao = input("Digite a opção desejada: ")

    if opcao == "1":
        nome = input("Digite o nome do titular da conta: ")
        numero_conta = input("Digite o número da conta: ")
        conta = ContaBancaria(nome, numero_conta)
        contas[numero_conta] = conta
        print("Conta criada com sucesso!")

    elif opcao == "2":
        numero_conta = input("Digite o número da conta: ")
        if numero_conta in contas:
            conta = contas[numero_conta]
            while True:
                print("\n======= Menu da Conta =======")
                print("1. Depositar")
                print("2. Sacar")
                print("3. Consultar saldo")
                print("4. Voltar ao menu principal")
                escolha = input("Digite a opção desejada: ")

                if escolha == "1":
                    valor_deposito = float(input("Digite o valor do depósito: "))
                    conta.depositar(valor_deposito)

                elif escolha == "2":
                    valor_saque = float(input("Digite o valor do saque: "))
                    conta.sacar(valor_saque)

                elif escolha == "3":
                    conta.consultar_saldo()

                elif escolha == "4":
                    break

                else:
                    print("Opção inválida!")

        else:
            print("Conta não encontrada.")

    elif opcao == "3":
        break

    else:
        print("Opção inválida!")
