import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pedir informações ao usuario
        System.out.println("Por favor, digite o numero da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine() ;

        System.out.println("Por favor, digite o seu nome: ");
        String nome_Cliente = scanner.nextLine() ;

        System.out.println("Por favor, digite o seu saldo; ");
        double saldo = scanner.nextDouble();

        //exibir a mensagem passada no desafio usando concatenação (+ variavel +)
        System.out.println("Olá "+ nome_Cliente +", obrigado por criar uma conta" +
                " em nosso banco, sua agência é " + agencia + ", conta "+ numero +" e " +
                "seu saldo "+ saldo +" já está disponível para saque");

        scanner.close();
    }
}