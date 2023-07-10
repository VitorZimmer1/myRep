import java.util.Locale;
import java.util.Scanner;
public class exerc6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double valorQualquer = input.nextDouble();

        if (valorQualquer < 0.0 || valorQualquer > 100.00)  {
            System.out.println("Fora de intervalo");
        }
        else if (valorQualquer <= 25.0) {
            System.out.println("Intervalo = [0,25]");
        }
        else if (valorQualquer <= 50.0) {
            System.out.println("Intervalo = [25,50]");
        }
        else if (valorQualquer <= 75.00) {
            System.out.println("Intervalo = [50,75]");
        }
        else    {
            System.out.println("Intervalo = [75,100]");
        }
        input.close();
    }
}