import java.util.Scanner;
public class eX2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite qualquer número");
        int anyNumber = input.nextInt();

        if(anyNumber % 2 == 0)  {
            System.out.printf("O número digitado %d%n é PAR", anyNumber);
        }   else {
            System.out.println("O número digitado é IMPAR");
        }

        input.close();

    }
}
