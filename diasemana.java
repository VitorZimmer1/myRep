import java.util.Scanner;

public class diasemana {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int diaDaSemana = input.nextInt();
        String dia;

        switch (diaDaSemana) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "dia inválido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
        input.close();
    }
}
