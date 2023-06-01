import javax.swing.*;

public class CadastroUsuario1 {
    private static void criarGUI() {
        // Criação da janela
        JFrame janela = new JFrame("Cadastro de Usuário");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal
        JPanel painel = new JPanel();
        janela.add(painel);

        // Componentes do painel
        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField(20);

        JLabel labelEmail = new JLabel("E-mail:");
        JTextField campoEmail = new JTextField(20);

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(e -> {
            // Obtém os valores digitados pelo usuário
            String nome = campoNome.getText();
            String email = campoEmail.getText();

            // Realiza o cadastro do usuário (aqui você pode adicionar sua lógica personalizada)
            System.out.println("Usuário cadastrado:");
            System.out.println("Nome: " + nome);
            System.out.println("E-mail: " + email);

            // Limpa os campos de texto
            campoNome.setText("");
            campoEmail.setText("");
        });

        // Adiciona os componentes ao painel
        painel.add(labelNome);
        painel.add(campoNome);
        painel.add(labelEmail);
        painel.add(campoEmail);
        painel.add(botaoCadastrar);

        // Exibe a janela
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CadastroUsuario1::criarGUI);
    }
}