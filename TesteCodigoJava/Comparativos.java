/*import java.util.Scanner;

public class Comparativos {

    public static void main(String[] args) {
        // && = E || = OU
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas Horas?");
        hora = sc.nextInt();

        if (hora > 0 && hora < 12) {
            System.out.println("Bom dia, agora são: " + hora + "Horas");
        }
        else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde, agora são: " + hora + "Horas");
        } 
        else {

            System.out.println("Boa noite, agora são: " + hora + " Horas");

        }
        sc.close();
    }

}
*/

/*import java.util.Scanner;

public class Comparativos {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um valor para X?");
        x = sc.nextInt();

        
        if (x > 0){
        	System.out.println("Seu valor de X é positivo");
        	System.out.println("X = " + x);
        }
        else if (x == 0){
        	System.out.println("Seu valor de X = 0");
        }
        else{
        	System.out.println("Seu valor de X é negativo");
        	System.out.println("Temos que X = " + x);
        }
        sc.close();
    }

}*/

/*import java.util.Scanner;
public class Comparativos {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Para que possamos ver qual calculo fazer escolha as seguintes operações: ");
        System.out.println("1- soma  2- Subtração 3- Multiplicação 4- Divisão");
        x = sc.nextInt();
        
        if (x == 1) {
        	int x1, y1,t1;
        	System.out.println("Você escolheu Soma");
        	System.out.println("Digite um valor para X");
        	x1 = sc.nextInt();
        	System.out.println("Digite um valor para y");
        	y1 = sc.nextInt();
        	t1 = x1 + y1;
        	System.out.println("A soma de " +x1+ " + " +y1+ " = " +t1 );
        }
        else if (x == 2) {
        	int x1, y1,t1;
        	System.out.println("Você escolheu subtração");
        	System.out.println("Digite um valor para X");
        	x1 = sc.nextInt();
        	System.out.println("Digite um valor para y");
        	y1 = sc.nextInt();
        	t1 = x1 - y1;
        	System.out.println("A subtração de " +x1+ " - " +y1+ " = " +t1 );
        }
        else if (x == 3) {
        	int x1, y1,t1;
        	System.out.println("Você escolheu multiplicação ");
        	System.out.println("Digite um valor para X");
        	x1 = sc.nextInt();
        	System.out.println("Digite um valor para y");
        	y1 = sc.nextInt();
        	t1 = x1 * y1;
        	System.out.println("A multiplicação de " +x1+ " x " +y1+ " = " +t1 );
        }
        else if (x == 4) {
        	int x1, y1,t1;
        	System.out.println("Você escolheu divisão ");
        	System.out.println("Digite um valor para X");
        	x1 = sc.nextInt();
        	System.out.println("Digite um valor para y");
        	y1 = sc.nextInt();
        	t1 = x1 / y1;
        	System.out.println("A multiplicação de " +x1+ " / " +y1+ " = " +t1 );
        }else {
        	System.out.println("Escolha uma opção valida.");
        }
        sc.close();
    }

}*/


import java.util.Scanner;

public class Comparativos { //Está como main por conta do repl.it os outros está como Comparativos por conta do Eclipse

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int numeroSecreto;
        int tentativas;
        int palpite;
        boolean acertou = false;

        do {
            numeroSecreto = (int) (Math.random() * 100) + 1;
            tentativas = 0;
            palpite = 0;
            acertou = false;

            System.out.println("Para que possamos iniciar o jogo, escolha uma das seguintes opções: ");
            System.out.println("1 - Iniciar 2 - Sair do jogo");

            x = sc.nextInt();

            if (x == 1) {
                System.out.println("\n Você escolheu jogar o jogo de adivinhação");
                System.out.println("\n Bem-vindo ao jogo de adivinhação! Tente adivinhar o número secreto entre 1 e 100.");

                while (!acertou) {
                    System.out.print("Digite o seu palpite: ");
                    palpite = sc.nextInt();
                    tentativas++;

                    if (palpite < numeroSecreto) {
                        System.out.println("O número secreto é maior.");
                    } else if (palpite > numeroSecreto) {
                        System.out.println("O número secreto é menor.");
                    } else {
                        System.out.println("Parabéns, você acertou o número secreto em " + tentativas + " tentativas!");
                        acertou = true;
                    }
                }
            } else if (x == 2) {
                System.out.println("Você escolheu sair do jogo, obrigado por experimentar.");
            } else {
                System.out.println("Escolha uma opção válida.");
            }

            if (!acertou) {
                System.out.println("Deseja jogar novamente? Digite 1 para jogar novamente ou 2 para sair do jogo.");
                x = sc.nextInt();
            } else {
                x = 1; 
            }
        } while (x != 2);

        sc.close();
    }
}
