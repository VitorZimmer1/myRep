import java.util.Scanner;

public class estruturaCondEx1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int justANumber = input.nextInt();

        System.out.println("Digite um número: ");

        if(justANumber >= 0)    {
            System.out.println("Este número é positivo");
        }   else    {
            System.out.println("Este número é negativo");
        }

        input.close();

    }
}
