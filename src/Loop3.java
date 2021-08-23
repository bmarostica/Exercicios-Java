import java.util.Scanner;

public class Loop3 {

    //Faça um programa que leia 5 números e informe o maior número.

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int menor;
        int maior = 0;
        int cont = 0;

        System.out.println("Informe 5 números");

        while(cont < 5) {
            menor = input.nextInt();
            input.nextLine();

            if (menor > maior) {
                maior = menor;
            }

            cont++;
        }

        System.out.println("O maior número é: " + maior);

    }
}
