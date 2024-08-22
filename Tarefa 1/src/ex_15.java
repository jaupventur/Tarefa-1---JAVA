// 15 - A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
// que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora
// regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas
// trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
// que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere
// que o mês possua 4 semanas exatas).

import java.util.Scanner;

public class ex_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasSemana = 40;
        int semanasMes = 4;
        int horasTrabalhoMensal = horasSemana * semanasMes;
        double taxaHoraExtra = 1.5;

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor do salário por hora: ");
        double salarioHora = scanner.nextDouble();

        double salarioTotal;
        if (horasTrabalhadas > horasTrabalhoMensal) {
            int horasExtras = horasTrabalhadas - horasTrabalhoMensal;
            double salarioHorasExtras = horasExtras * salarioHora * taxaHoraExtra;
            salarioTotal = (horasTrabalhoMensal * salarioHora) + salarioHorasExtras;
        } else {
            salarioTotal = horasTrabalhadas * salarioHora;
        }

        System.out.printf("O salário total do funcionário é: R$ %.2f%n", salarioTotal);

        scanner.close();
    }
}

/*
  Teste de Mesa

  | Variável              | Valor Inicial | Valor Final |
  |-----------------------|---------------|-------------|
  | horasTrabalhadas       | -             | 170         |
  | salarioHora            | -             | 20.00       |
  | horasTrabalhoMensal    | 160           | 160         |
  | horasExtras            | -             | 10          |
  | salarioHorasExtras     | -             | 300.00      |
  | salarioTotal           | -             | 3500.00     |

*/