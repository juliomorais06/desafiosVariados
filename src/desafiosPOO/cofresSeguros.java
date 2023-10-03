package desafiosPOO;

import java.util.Scanner;

abstract class cofresSeguros {
  protected String tipo;
  protected String metodoAbertura;

  public cofresSeguros(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends cofresSeguros {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends cofresSeguros {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}
public class Desafio {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    CofreFisico cofrefis = new CofreFisico();
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      int senha = scanner.nextInt();
      int confirmacaoSenha = scanner.nextInt();
      CofreDigital cofredig = new CofreDigital(senha);
      cofredig.imprimirInformacoes();
      boolean confirmarSenha = cofredig.validarSenha(confirmacaoSenha);
      
      if(confirmarSenha == true) {
        System.out.println("Cofre aberto!");
      }else
      System.out.println("Senha incorreta!");
  }else
  cofrefis.imprimirInformacoes();
}
}
