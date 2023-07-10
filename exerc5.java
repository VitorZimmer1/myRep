import java.util.Locale;
import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codigoItem = input.nextInt();
        int quantidadeItem = input.nextInt();
        double preco;

        if (codigoItem == 1)    {
            System.out.println("Você escolheu o Cachorro quente! ");
            preco = quantidadeItem * 4;
        }
        else if (codigoItem == 2)   {
            System.out.println("Você escolheu o X-salada! ");
            preco = quantidadeItem * 4.5;
        }
        else if (codigoItem == 3)   {
            System.out.println("Você escolheu o X-bacon! ");
            preco = quantidadeItem * 5;
        }
        else if (codigoItem == 4)   {
            System.out.println("Você escolheu a Torrada simples");
            preco = quantidadeItem * 2;
        }
        else {
            System.out.println("Você escolheu o refrigerante");
            preco = quantidadeItem * 1.5;
        }

        System.out.printf("O total a se pagar é de: R$ %.2f reais", preco);

        input.close();
    }
}
