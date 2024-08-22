
    // 10 - Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
// simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar
// que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

    import java.util.Scanner;

    public class ex_10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        int nota1 = sc.nextInt();
        System.out.println("Digite a nota 2: ");
        int nota2 = sc.nextInt();
        int media = (nota1 + nota2) / 2;
        System.out.println("Media: " + media);
        if (media >= 6) {
            System.out.println("Aprovado");
        }
        else if (media < 6) {
            System.out.println("Reprovado");
            }
    }
}
/*
  Teste de Mesa

  Cenário 1: Média maior ou igual a 6
  | Variável | Valor Inicial | Valor Final |
  |----------|---------------|-------------|
  | nota1    | -             | 7           |
  | nota2    | -             | 8           |
  | media    | -             | 7           |

 */
