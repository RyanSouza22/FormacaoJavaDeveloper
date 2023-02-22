import java.util.Scanner;
import java.util.Locale;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        /* 
        * TO DO:
        *       Conhecer e Importar a classe Scanner
        *       Exbir as mensagens para o Usuario
        *       Obter pelo Scanner os valores digitados pelo terminal
        *       Exibir a mensagem da conta criada
        **/

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            ContaTerminal novaConta = new ContaTerminal();

            System.out.println("Por favor inserir Numero da Conta: ");
            novaConta.numero = scanner.nextInt();

            System.out.println("Por favor inserir Agencia: ");
            novaConta.agencia = scanner.next();

            System.out.println("Por favor inserir seu Nome completo: ");
            novaConta.nomeCliente = scanner.next();

            System.out.println("Por favor inserir Saldo da Conta: ");
            novaConta.saldo = scanner.nextDouble();

            System.out.println("");
            System.out.printf("Olá " + novaConta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + novaConta.agencia + ", conta " + novaConta.numero + " e seu saldo R$ %.2f já está disponível para saque.", novaConta.saldo);
        }
    }
}
