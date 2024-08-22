// 14 - Ler a hora de início e a hora de fim de um jogo de Xadrez       |
// (considere apenas horas inteiras, sem os minutos) e calcule a        |
// duração do jogo em horas, sabendo-se que o tempo máximo de duração   |
// do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar |
// no dia seguinte.                                                     |
// ---------------------------------------------------------------------|
import java.util.Scanner;

public class ex_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o horário de início da partida: ");
        int inicio = sc.nextInt();

        System.out.print("Insira o horário de término da partida: ");
        int fim = sc.nextInt();

        int duracao;
        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
        }

        if (duracao == 0) {
            duracao = 24;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas");

        sc.close();
    }
}

/*
  Teste de Mesa

  | Variável | Valor Inicial | Valor Final |
  |----------|---------------|-------------|
  | inicio   | -             | 10          |
  | fim      | -             | 14          |
  | duracao  | -             | 4           |

*/

