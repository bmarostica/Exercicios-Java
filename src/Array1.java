import java.util.Scanner;

public class Array1 {

//    Crie um programa que receba 5 valores e armazene em um vetor.
//    Crie um segundo vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor multiplicados por 2.
//    Ou seja: segundoVetor[i] = primeiroVetor[i] * 2. No final, imprima o conteúdo dos dois vetores.

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] valores = new int[5];
        int[] dobroValores = new int[5];

        System.out.println("Insira 5 valores");

        for(int i = 0; i < valores.length; i++){
            valores[i] = input.nextInt();
            input.nextLine();
        }

        for(int i = 0; i < dobroValores.length; i++){
            dobroValores[i] = valores[i] * 2;

            System.out.printf("Valores: %d  Valores dobrados: %d%n", valores[i]++, dobroValores[i]++);
        }
    }
}
