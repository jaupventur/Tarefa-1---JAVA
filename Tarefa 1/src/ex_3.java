// 3- Escreva um algoritmo para ler o salário mensal atual de um funcionário e
//o percentual de reajuste. Calcular e escrever o valor do novo salário.

public class ex_3 {
    public static void main(String[] args) {
        int salario = 1900;
        double reajuste = 0.03;
        double salarioreajuste = (salario * reajuste);
        System.out.println("---------------");
        System.out.println(salarioreajuste + salario );

    }
}
/*
  Teste de Mesa

  | Variável       | Valor Inicial | Valor Final |
  |----------------|---------------|-------------|
  | salario        | 1900          | 1900        |
  | reajuste       | 0.03          | 0.03        |
  | salarioreajuste| -             | 57.0        |

 */