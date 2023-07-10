import java.util.Scanner;
public class exerc3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A e B");
        int A = input.nextInt();
        int B = input.nextInt();

        if(A % B == 0 || B % A == 0)    {
            System.out.println("São multiplos");
        }   else {
                System.out.println("Não são multiplos");
            }
        input.close();
    }
}
