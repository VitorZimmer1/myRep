import java.util.Locale;
import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double salarioPessoaLisarb = input.nextDouble();

        double imposto;
        if (salarioPessoaLisarb <= 2000.00) {
            imposto = 0.0;
        } else if (salarioPessoaLisarb <= 3000.0) {
            imposto = (salarioPessoaLisarb - 2000.0) * 0.08;
        } else if (salarioPessoaLisarb <= 4500.0) {
            imposto = (salarioPessoaLisarb - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salarioPessoaLisarb - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }
        input.close();
    }
}
