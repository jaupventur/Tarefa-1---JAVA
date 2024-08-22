// 5 -  Uma revendedora de carros usados paga a seus funcionários vendedores um salário
// fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor
// das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por
// ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por
// carro vendido. Calcule e escreva o salário final do vendedor.


public class ex_5 {
    public static void main(String[] args) {
        int salario = 2000;
        int comissaoFixa = 100;
        double comissaoVenda = 0.05;
        int carrosVendidos = 2;
        double TotalVendasMes = 35000;
        double comissao = (comissaoVenda * TotalVendasMes );
        int salarioFinal = ( salario + comissaoFixa);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        System.out.println("A quantidade de carros vendidos este mês foi de -> " + carrosVendidos + " carros");
        System.out.println();
        System.out.println("A comissão por carros vendidos será de -> R$" + comissao);
        System.out.println();
        System.out.println("O valor do salario final será de -> R$" + (salarioFinal + comissao));
        System.out.println();
        System.out.println("---------------------------------------------------------------------");



    }
}

/*
  Teste de Mesa

  | Variável         | Valor Inicial | Valor Final |
  |------------------|---------------|-------------|
  | salario          | 2000          | 2000        |
  | comissaoFixa     | 100           | 100         |
  | comissaoVenda    | 0.05          | 0.05        |
  | carrosVendidos   | 2             | 2           |
  | TotalVendasMes   | 35000         | 35000       |
  | comissao         | -             | 1750.0      |
  | salarioFinal     | -             | 2100        |

 */