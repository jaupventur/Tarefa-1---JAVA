// 12 -Ler dois valores (considere que não serão lidos valores iguais)
//e escrever o maior deles.

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um valor 1: ");
        int valor1 = sc.nextInt();
        System.out.print("Insira um valor 2: ");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior valor é " + valor1);
        }
        else {
            System.out.println(("O maior valor é " + valor2));
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