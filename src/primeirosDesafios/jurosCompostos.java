package primeirosDesafios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class jurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        for (int i=0; i<periodo; i++) {
          valorFinal = valorInicial + (valorInicial * taxaJuros);
          valorInicial = valorFinal;
        }
      
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#.00");
        
        System.out.print("Valor final do investimento: R$ ");
        System.out.println(df.format(valorFinal));
        
        scanner.close();
    }
}
//criar funcao que receba 3 parametros:
    // valorInicialInvestimento (int ou decimal), taxaJurosAnual (decimal) 
    // tempoAnos (int) 

// funcao deve retornar valor final do investimento

// valor final deve ser arredondado para duas casas decimais