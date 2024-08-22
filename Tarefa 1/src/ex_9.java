// 9 - As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
// compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas,
// calcule e escreva o custo total da compra.


public class ex_9 {
    public static void main(String[] args) {

        double apple = 1.30;
        int vendidas = 9;
            if (vendidas < 12) {
                 apple = 1.30;
           }
            else if (vendidas > 12) {
                apple = 1;
           }
            double valor = (vendidas * apple);
            System.out.println("O valor da compra de " + vendidas + " é de R$" + valor);

    }
}
/*
  Teste de Mesa

  Cenário 1: Menos de 12 maçãs vendidas
  | Variável  | Valor Inicial | Valor Final |
  |-----------|---------------|-------------|
  | apple     | 1.30          | 1.30        |
  | vendidas  | -             | 9           |
  | valor     | -             | 11.7        |

 */