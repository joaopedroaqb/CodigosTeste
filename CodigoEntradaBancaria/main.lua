function exibirMenu()
    print("Menu:")
    print("1. Consultar saldo")
    print("2. Depositar")
    print("3. Sacar")
    print("4. Sair")
end

local saldo = 0


while true do
    exibirMenu()
    print("Escolha uma opção: ")
    local opcao = io.read("*n") 

    if opcao == 1 then
        print("Saldo atual: $" .. saldo)
    elseif opcao == 2 then
        print("Digite o valor a ser depositado: ")
        local valor = io.read("*n") 
        saldo = saldo + valor
        print("Depósito realizado com sucesso.")
    elseif opcao == 3 then
        print("Digite o valor a ser sacado: ")
        local valor = io.read("*n")
        if valor > saldo then
            print("Saldo insuficiente.")
        else
            saldo = saldo - valor
            print("Saque realizado com sucesso.")
        end
    elseif opcao == 4 then
        print("Programa encerrado.")
        break 
    else
        print("Opção inválida. Por favor, escolha uma opção válida.")
    end

    print("------------------------")
end
