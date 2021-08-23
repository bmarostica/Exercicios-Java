import java.util.Scanner;

public class Array2 {

//    Crie um programa que leia 10 valores inteiros correspondentes as idades de um grupo de pessoas e armazene em um vetor.
//    Escreva uma lógica para determinar a quantidade de pessoas que possuem idade igual ou superior a 18 anos.
//    Ao final, imprima o vetor de idades e a quantidade de pessoas maiores de idade.

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] idades = new int[10];
        int maiorIdade = 0;

        System.out.println("Insira 10 idades");

        for(int i = 0; i < idades.length; i++){
            idades[i] = input.nextInt();
            input.nextLine();

            if(idades[i] >= 18) {
                maiorIdade += +1;
            }
        }

        for(int i = 0; i < idades.length; i++){
            System.out.printf("Idade %d%n", idades[i]);
        }

        System.out.printf("Número de pessoas com 18 anos ou mais: %d", maiorIdade);

    }
}
