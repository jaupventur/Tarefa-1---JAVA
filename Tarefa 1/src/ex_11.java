// 11 - Ler o ano atual e o ano de nascimento de uma pessoa.
// Escrever uma mensagem que diga se ela poderá ou não votar
// este ano (não é necessário considerar o mês em que a pessoa nasceu).

import java.util.Scanner;
public class ex_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int ano = sc.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        int nascimento = sc.nextInt();

        int idade = (ano - nascimento);

        if (idade < 18) {
            System.out.println("Você não pode votar.");
        }
        else if (idade >= 18) {
            System.out.println("Você pode votar.");
        }
        sc.close();

    }
}
/*
  Teste de Mesa

  Cenário 1: Pessoa menor de idade
  | Variável   | Valor Inicial | Valor Final |
  |------------|---------------|-------------|
  | ano        | -             | 2024        |
  | nascimento | -             | 2010        |
  | idade      | -             | 14          |

 */