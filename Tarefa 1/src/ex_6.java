// 6 -  Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
//correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

public class ex_6 {
    public static void main(String[] args) {
        int TempFahrenheit = 63;
        int Celcius = 32;
        double TempCelcius = ((TempFahrenheit - Celcius) / 1.8);
        System.out.println(TempCelcius);

    }
}

/*
  Teste de Mesa

  Cenário 1: Temperatura em Fahrenheit é 63
  | Variável       | Valor Inicial | Valor Final |
  |----------------|---------------|-------------|
  | TempFahrenheit | 63            | 63          |
  | Celcius        | 32            | 32          |
  | TempCelcius    | -             | 17.2222     |

 */
