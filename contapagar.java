import java.util.Locale;
import java.util.Scanner;

public class contapagar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int minutos = input.nextInt();

        double conta = 50.0;
        if (minutos > 100)   {
            conta = conta + (minutos - 100) * 2;
        }
            else {
                conta = 50.0;
            }
        System.out.println("Valor a pagar : R$ " + conta);
        input.close();
    }
}
