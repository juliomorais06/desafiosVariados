import java.util.Scanner;

public class depositoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
          System.out.printf("Deposito realizado com sucesso!\nSaldo atual: R$ %.2f" , valor);

        } else if (valor == 0) {
          System.out.println("Encerrando o programa...");
          
        } else {
          System.out.println("Valor invalido! Digite um valor maior que zero.");
             
        }
    }
}