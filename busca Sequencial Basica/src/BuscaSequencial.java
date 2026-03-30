import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        int[] vetor = new int[80];
        for (int i = 0; i < 80; i++) vetor[i] = i * 2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para buscar: ");
        int busca = sc.nextInt();

        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == busca) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não existe no vetor.");
        }
    }
}