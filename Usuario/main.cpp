#include <iostream>
#include <string>

struct Usuario {
    std::string nome;
    std::string email;
};

void cadastrarUsuario(Usuario& usuario) {
    std::cout << "Nome: ";
    std::getline(std::cin, usuario.nome);

    std::cout << "E-mail: ";
    std::getline(std::cin, usuario.email);

    std::cout << "Usuário cadastrado:" << std::endl;
    std::cout << "Nome: " << usuario.nome << std::endl;
    std::cout << "E-mail: " << usuario.email << std::endl;
}

int main() {
    Usuario usuario;

    cadastrarUsuario(usuario);

    return 0;
}
