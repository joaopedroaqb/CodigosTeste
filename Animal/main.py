class Animal:
    def __init__(self, id, breed, birth_date):
        self.id = id
        self.breed = breed
        self.birth_date = birth_date


class RegistroAlimentacao:
    def __init__(self, animal_id, data, quantidade):
        self.animal_id = animal_id
        self.data = data
        self.quantidade = quantidade


class RegistroPeso:
    def __init__(self, animal_id, data, peso):
        self.animal_id = animal_id
        self.data = data
        self.peso = peso


class RegistroGadoApp:
    def __init__(self):
        self.animais = []
        self.registros_alimentacao = []
        self.registros_peso = []

    def exibir_menu(self):
        print("===== Menu =====")
        print("1. Registrar Animal")
        print("2. Registrar Alimentação")
        print("3. Registrar Peso")
        print("4. Exibir Relatório")
        print("5. Sair")

    def registrar_animal(self):
        id = input("Digite o ID do animal: ")
        breed = input("Digite a raça do animal: ")
        birth_date = input("Digite a data de nascimento do animal: ")
        animal = Animal(id, breed, birth_date)
        self.animais.append(animal)
        print("Animal registrado com sucesso!\n")

    def registrar_alimentacao(self):
        animal_id = input("Digite o ID do animal: ")
        data = input("Digite a data da alimentação (DD/MM/AAAA): ")
        quantidade = float(input("Digite a quantidade de alimento fornecida: "))
        registro_alimentacao = RegistroAlimentacao(animal_id, data, quantidade)
        self.registros_alimentacao.append(registro_alimentacao)
        print("Alimentação registrada com sucesso!\n")

    def registrar_peso(self):
        animal_id = input("Digite o ID do animal: ")
        data = input("Digite a data da pesagem (DD/MM/AAAA): ")
        peso = float(input("Digite o peso do animal: "))
        registro_peso = RegistroPeso(animal_id, data, peso)
        self.registros_peso.append(registro_peso)
        print("Peso registrado com sucesso!\n")

    def exibir_relatorio(self):
        print("===== Relatório =====")
        for animal in self.animais:
            print("ID:", animal.id, "| Raça:", animal.breed, "| Data de Nascimento:", animal.birth_date)
            print("Histórico de Alimentação:")
            for registro in self.registros_alimentacao:
                if registro.animal_id == animal.id:
                    print("Data:", registro.data, "| Quantidade:", registro.quantidade)
            print("Histórico de Peso:")
            for registro in self.registros_peso:
                if registro.animal_id == animal.id:
                    print("Data:", registro.data, "| Peso:", registro.peso)
            print("=====================")


if __name__ == "__main__":
    app = RegistroGadoApp()
    while True:
        app.exibir_menu()
        opcao = int(input("Escolha a opção desejada: "))

        if opcao == 1:
            app.registrar_animal()
        elif opcao == 2:
            app.registrar_alimentacao()
        elif opcao == 3:
            app.registrar_peso()
        elif opcao == 4:
            app.exibir_relatorio()
        elif opcao == 5:
            print("Encerrando o aplicativo...")
            break
        else:
            print("Opção inválida. Tente novamente.")
