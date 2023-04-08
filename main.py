def frase_para_binario(frase):
    # Converte a frase para uma sequência de bytes em formato UTF-8
    bytes_utf8 = frase.encode('utf-8')
    
    # Converte cada byte para sua representação em binário
    binarios = [bin(byte)[2:].zfill(8) for byte in bytes_utf8]
    
    # Junta todos os binários em uma única string
    frase_binario = ''.join(binario for binario in binarios)
    
    return frase_binario

while True:
    # Solicita ao usuário que digite uma frase
    frase = input("Digite uma frase: ")

    # Chama a função para converter a frase em binário
    frase_binario = frase_para_binario(frase)

    # Imprime a frase em binário
    print("Frase em binário: ", frase_binario)
    
    # Pergunta ao usuário se deseja fazer outra pergunta ou sair
    opcao = input("Deseja fazer outra pergunta? (S/N): ")
    if opcao.lower() != 's':
        break  
print()
print("Obrigado por usar nosso tradutor")