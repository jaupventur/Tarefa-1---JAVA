//2- Escreva um algoritmo para ler o número total de eleitores de um
//município, o número de votos brancos, nulos e válidos. Calcular
//e escrever o percentual que cada um representa em relação ao total de eleitores.

public class ex_2 {
    public static void main(String[] args) {
        float total = 33374;
        int brancos = 1182;
        int nulos = 643;
        int validos =31549;
        float per_brancos = ((brancos / total) * 100);
        float per_nulos = ((nulos / total) * 100);
        float per_validos = ((validos / total) * 100);
        System.out.println("Brancos: " + per_brancos + "%");
        System.out.println("Nulos: " + per_nulos + "%");
        System.out.println("Validos: " + per_validos + "%");
    }
}
/*
  Teste de Mesa

  | Variável      | Valor Inicial | Valor Final  |
  |---------------|---------------|--------------|
  | total         | 33374         | 33374        |
  | brancos       | 1182          | 1182         |
  | nulos         | 643           | 643          |
  | validos       | 31549         | 31549        |
  | per_brancos   | -             | 0.0          |
  | per_nulos     | -             | 0.0          |
  | per_validos   | -             | 0.0          |

 */

