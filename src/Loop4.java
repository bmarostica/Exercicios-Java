import java.util.Scanner;

public class Loop4 {

//    Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
//    O usuário deve informar de qual número ele deseja ver a tabuada.

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int tabuada;
        int valor = 1;

        System.out.println("Informe a tabuada:");
        tabuada = input.nextInt();
        input.nextLine();

        System.out.printf("Tabuada do %d %n", tabuada);

        for(int num = valor; num <= 10; num++){
            System.out.println(tabuada + " x " + valor + " = " + tabuada*valor);
            valor++;
        }

    }

}
