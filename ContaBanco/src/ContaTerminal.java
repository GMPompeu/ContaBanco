import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Para começarmos digite seu nome!");
        String nome = scanner.next();

        System.out.println("Agora digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Informe o numero da sua conta");
        String numConta = scanner.next();

        
    }
}
