package primeirosDesafios;
import java.util.Scanner;

public class equilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

       double equilibrandoSaldo = saldoAtual + valorDeposito - valorRetirada;
       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.

     System.out.printf("Saldo atualizado na conta: %.1f",equilibrandoSaldo);
     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    }
}