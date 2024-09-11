import java.util.Scanner;

public class criando_personagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pontos iniciais e atributos
        final int total_pontos = 100;
        int pontos_restantes = total_pontos;
        int forca = 0;
        int destreza = 0;
        int inteligencia = 0;

        while (pontos_restantes > 0) {
            System.out.println("\nPontos restantes: " + pontos_restantes);
            System.out.println("Escolha o atributo para alocar pontos:");
            System.out.println("1. Força");
            System.out.println("2. Destreza");
            System.out.println("3. Inteligência");
            System.out.println("4. Exibir Tabela de atributos");
            System.out.print("Digite o número do atributo: ");
            int escolha = scanner.nextInt();

            if (escolha != 4) {
                System.out.print("Quantos pontos deseja alocar para " + (escolha == 1 ? "Força" : escolha == 2 ? "Destreza" : "Inteligência") + "? ");
                int pontos = scanner.nextInt();

                if (pontos < 0) {
                    System.out.println("A quantidade de pontos não pode ser negativa. Tente novamente.");
                } else if (pontos > pontos_restantes) {
                    System.out.println("Você não pode alocar mais pontos do que o disponível. Tente novamente.");
                } else {
                    switch (escolha) {
                        case 1:
                            forca += pontos;
                            break;
                        case 2:
                            destreza += pontos;
                            break;
                        case 3:
                            inteligencia += pontos;
                            break;
                        default:
                            System.out.println("Escolha inválida. Tente novamente.");
                            continue;
                    }
                    pontos_restantes -= pontos;
                }
            } else {
                System.out.println("\nTabela de Atributos:");
                System.out.println("+--------------------+");
                System.out.println("| Atributo   | Pontos |");
                System.out.println("+--------------------+");
                System.out.printf("| Força     | %6d |\n", forca);
                System.out.printf("| Destreza  | %6d |\n", destreza);
                System.out.printf("| Inteligência | %4d |\n", inteligencia);
                System.out.println("+--------------------+");
            }
        }

        System.out.println("\nDistribuição final dos pontos:");
        System.out.println("Força: " + forca);
        System.out.println("Destreza: " + destreza);
        System.out.println("Inteligência: " + inteligencia);

        scanner.close();
    }
}
