import java.util.Locale;
import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double valor1 = input.nextDouble();
        double valor2 = input.nextDouble();

        if (valor1 == 0 && valor2 == 0)   {
            System.out.println("Origem");
        }
        else if (valor1 == 0)    {
            System.out.println("Eixo y");
        }
        else if (valor2 == 0)   {
            System.out.println("Eixo x");
        }
        else if (valor1 > 0.0 && valor2 > 0.0)   {
            System.out.println("Q1");
        }
        else if (valor1 < 0.0 && valor2 > 0.0)  {
            System.out.println("Q2");
        }
        else if (valor1 < 0.0 && valor2 < 0.0)  {
            System.out.println("Q3");
        }
        else    {
            System.out.println("Q4");
        }
        input.close();
    }
}
