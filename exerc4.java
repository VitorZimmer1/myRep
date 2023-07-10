import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaInicialDoJogo = input.nextInt();
        int horaFinalDoJogo = input.nextInt();

        int duracao;
        if (horaInicialDoJogo < horaFinalDoJogo)    {
            duracao = horaFinalDoJogo - horaInicialDoJogo;
        }
        else {
                duracao = 24 - horaInicialDoJogo + horaFinalDoJogo;
        }

        System.out.println("O jogo durou " + duracao + " horas");

        input.close();
    }
}
