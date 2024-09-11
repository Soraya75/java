import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPersonagens = 5;

        int[] forca = new int[numPersonagens];
        int[] destreza = new int[numPersonagens];
        int[] inteligencia = new int[numPersonagens];
        
        for (int i = 0; i < numPersonagens; i++) {
            System.out.printf("Digite os atributos para o personagem %d:%n", i + 1);
            System.out.print("Força: ");
            forca[i] = scanner.nextInt();
            System.out.print("Destreza: ");
            destreza[i] = scanner.nextInt();
            System.out.print("Inteligência: ");
            inteligencia[i] = scanner.nextInt();
            System.out.println(); 
        }

        scanner.close();

        double mediaForca = calcularMedia(forca);
        double mediaDestreza = calcularMedia(destreza);
        double mediaInteligencia = calcularMedia(inteligencia);

        System.out.println("Média dos atributos dos personagens:");
        System.out.printf("Força: %.2f%n", mediaForca);
        System.out.printf("Destreza: %.2f%n", mediaDestreza);
        System.out.printf("Inteligência: %.2f%n", mediaInteligencia);
    }

    private static double calcularMedia(int[] valores) {
        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        return (double) soma / valores.length;
    }
}
