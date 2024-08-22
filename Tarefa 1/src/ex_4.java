// 4 - O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
//porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
//escrever um algoritmo para ler o custo de fábrica de um carro, calcular e
//escrever o custo final ao consumidor.

public class ex_4 {
    public static void main(String[] args) {
        int fabrica = 20000;
        double distribuidor = 0.28;
        double imposto = 0.45;
        double valorFinal = ((distribuidor * fabrica) + (imposto * fabrica) + fabrica);
        System.out.println("Valor do carro: " + valorFinal);
    }
}
/*
  Teste de Mesa

  | Variável      | Valor Inicial | Valor Final |
  |---------------|---------------|-------------|
  | fabrica       | 20000         | 20000       |
  | distribuidor  | 0.28          | 0.28        |
  | imposto       | 0.45          | 0.45        |
  | valorFinal    | -             | 34600.0     |

 */
