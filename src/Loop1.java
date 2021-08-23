import java.util.Scanner;

public class Loop1 {

//    Faça um programa que peça uma nota, entre zero e dez. Caso o valor informado seja inválido, ou seja, não esteja entre zero e dez,
//    mostre uma mensagem informando o problema, mas mantenha o programa em execução pedindo novamente a nota até que o usuário informe um valor válido.
//    Quando o usuário informar uma nota válida, imprima o valor da nota.

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int valor;

        do{
            System.out.println("Escreva um número entre 0 e 10");

            valor = input.nextInt();
            input.nextLine();

            if(valor < 0 && valor > 10){
                System.out.println("Valor informado inválido");
            }
            else {
                System.out.printf("O valor informado foi: %d %n", valor);
            }

        }while(valor < 0 || valor > 10);

    }
}
