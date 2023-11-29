package Projeto;

import java.util.Scanner;

public class SimulacaoAnimalController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao simulador de ecossistema!");

        EcossistemaController ecossistema = new EcossistemaController();

        System.out.print("Quantas simulações de anos deseja realizar? ");
        int numeroSimulacoes = scanner.nextInt();

        // Adicionar animais ao ecossistema apenas se ainda não foram adicionados
        if (!ecossistema.temAnimais()) {
            adicionarAnimais(ecossistema, scanner);
        }

        // Realizar as simulações
        for (int i = 0; i < numeroSimulacoes; i++) {
            System.out.println("Simulação " + (i + 1));

            // Verificar se há animais antes de simular o ano
            if (ecossistema.temAnimais()) {
                ecossistema.simularAno();
            } else {
                System.out.println("Não há animais no ecossistema. A simulação terminou.");
                break;  // Se não há animais, interrompa o loop de simulação
            }
        }

        scanner.close();
    }

    private static void adicionarAnimais(EcossistemaController ecossistema, Scanner scanner) {
        System.out.println("Adicione animais ao ecossistema:");
        System.out.println("1. Lobo");
        System.out.println("2. Coelho");
        System.out.println("3. Urso");
        System.out.println("4. Águia");
        System.out.println("5. Árvore");
        System.out.println("6. Arbusto");
        System.out.println("0. Sair da adição de animais");

        int escolha;
        do {
            System.out.print("Escolha um animal (0-6): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.next();  // Limpe o buffer do scanner
            }
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    ecossistema.adicionarSerVivo(new Lobo("Lobo"));
                    break;
                case 2:
                    ecossistema.adicionarSerVivo(new Coelho("Coelho"));
                    break;
                case 3:
                    ecossistema.adicionarSerVivo(new Mamifero("Urso", Especie.URSO));
                    break;
                case 4:
                    ecossistema.adicionarSerVivo(new Ave("Aguia", Especie.AGUIA));
                    break;
                case 5:
                    ecossistema.adicionarSerVivo(new Arvore("Árvore", "Tipo da Árvore"));
                    break;
                case 6:
                    ecossistema.adicionarSerVivo(new Arbusto("Arbusto", "Tipo do Arbusto"));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        } while (escolha != 0);
    }
}
