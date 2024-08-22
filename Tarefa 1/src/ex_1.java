/*1- Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
//meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
//Considerar ano com 365 dias e mês com 30 dias
 */

public class ex_1 {
    public static void main(String[] args) {
       System.out.println("-----------------");
       int anos = 20;
       int meses = 4;
       int dias = 27;
       int amd = ((365  * anos)+(30 * meses)+ dias);
       System.out.println("-----------------");
       System.out.println("Sua em dias é -> " + amd);
       System.out.println("-----------------");
    }
}
/*
  Teste de Mesa

  | Variável | Valor Inicial | Valor Final  |
  |----------|---------------|--------------|
  | anos     | 20            | 20           |
  | meses    | 4             | 4            |
  | dias     | 27            | 27           |
  | amd      | -             | 7467         |

 */