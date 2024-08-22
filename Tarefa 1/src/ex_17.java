// 17 - Programa que leia as notas e calcule a média de LP1 deste semestre,
//referente a um determinado aluno.
//
//Fórmula para cálculo de média de LP1.
//(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.2)



import java.util.Objects;
import java.util.Scanner;

public class ex_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas notas em LP1");

        System.out.print("P1: ");
        double p1 = sc.nextDouble();

        System.out.print("E1: ");
        double e1 = sc.nextDouble();

        System.out.print("E2: ");
        double e2 = sc.nextDouble();

        double m1 = (p1 * 0.6 + ((e1 + e2) / 2) * 0.4) * 0.5;
        double max = (m1 / 0.5) - 5.9;

        if (max < 0) {
            System.out.println("A média do aluno é 0");
        } else if (max > 0) {

            double media2 = 1.0;
            double x = 0;
            double sub = 0;

            System.out.print("API: ");
            double api = sc.nextDouble();

            System.out.println("Teve ponto extra? (s/n)");
            String ptExtra = sc.next();

            if (Objects.equals(ptExtra, "s")) {
                System.out.print("Ponto Extra: ");
                x = sc.nextDouble();
            }

            if (m1 < 6) {
                System.out.print("SUB: ");
                sub = sc.nextDouble();
            }

            double m3 = (api * 0.5) + x + (sub * 0.2);

            double mediaTotal = m1 + media2 * m3;

            System.out.println("A média do aluno é: " + String.format("%.2f", mediaTotal));

        }

        sc.close();
    }
}

/*
  Teste de Mesa

  | Variável | Valor Inicial | Valor Final  |
  |----------|---------------|--------------|
  | p1       | -             | 7.0          |
  | e1       | -             | 6.0          |
  | e2       | -             | 8.0          |
  | m1       | -             | 3.8          |
  | max      | -             | -0.2         |
  | api      | -             | 9.0          |
  | x        | -             | 2.0          |
  | sub      | -             | 0.0          |
  | mediaTotal| -            | 6.20         |
*/
