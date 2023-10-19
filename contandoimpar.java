package contandoimpar;

import java.util.Random;

public class contandoimpar{

    public static void main(String[] args) {
        // Tamanho do array
        int tamanhoArray = 30;

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Cria um array para armazenar os números aleatórios
        int[] numerosAleatorios = new int[tamanhoArray];

        // Preenche o array com números aleatórios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numerosAleatorios[i] = random.nextInt(100) + 1;
        }

        // Inicializa uma variável para contar os números ímpares
        int contadorImpares = 0;

        // Conta os números ímpares no array
        for (int i = 0; i < tamanhoArray; i++) {
            if (numerosAleatorios[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        // Imprime o array de números aleatórios
        System.out.println("Array de números aleatórios:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }

        // Imprime a contagem de números ímpares
        System.out.println("\nNúmero de números ímpares: " + contadorImpares);
    }
}
