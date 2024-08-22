/* 16 - Na empresa em que trabalhamos, há tabelas com o gasto de cada mês.
Para fechar o balanço do primeiro trimestre, precisamos somar o
gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais,
em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um
programa que calcule e imprima a despesa total no trimestre e a
média mensal de gastos.
 */

public class ex_16 {

    public static void main(String[] args) {

        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        int despesaTotalTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;

        double mediaMensal = despesaTotalTrimestre / 3.0;

        System.out.println("Despesa total no trimestre: R$ " + despesaTotalTrimestre);
        System.out.println("Média mensal de gastos: R$ " + String.format("%.2f", mediaMensal));
    }
}
/*
  Teste de Mesa

  | Variável              | Valor Inicial | Valor Final |
  |-----------------------|---------------|-------------|
  | gastoJaneiro          | 15000         | 15000       |
  | gastoFevereiro        | 23000         | 23000       |
  | gastoMarco            | 17000         | 17000       |
  | despesaTotalTrimestre | -             | 55000       |
  | mediaMensal           | -             | 18333.33    |

*/




