// 13 - Ler dois valores (considere que não serão lidos valores iguais)
// e escrevê-los em ordem crescente.

import java.util.Scanner;

public class ex_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor 1: ");
        int a = sc.nextInt();
        System.out.print("Insira o valor 2: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Valores em ordem crecente");
            System.out.println(b + ", " + a);
        }
        else if (a < b) {
            System.out.println("Valores em ordem crecente");
            System.out.println(a + ", " + b);
        }
        sc.close();

    }
}

/*
  Teste de Mesa

  | Variável | Valor Inicial | Valor Final |
  |----------|---------------|-------------|
  | a        | -             | 10          |
  | b        | -             | 5           |

*/
