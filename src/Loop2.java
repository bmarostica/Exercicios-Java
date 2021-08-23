import java.util.Scanner;

public class Loop2 {

//    Faça um programa que leia dois números e imprima todos os valores presentes no intervalo entre eles, um abaixo do outro.
//    Caso o segundo número seja menor ou igual ao primeiro, solicite um novo número até que o segundo número seja maior que o primeiro

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Informe um número");
        valor1 = input.nextInt();
        input.nextLine();

        do {
            System.out.println("Informe um número maior do que o anterior");
            valor2 = input.nextInt();
            input.nextLine();
        }while(valor2 <= valor1 );

        for(int contador = valor1; contador <= valor2; contador++){
            System.out.println(contador);
        }

    }
}
