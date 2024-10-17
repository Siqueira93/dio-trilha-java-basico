import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Sejam bem vindo a sua conta no novo Banco.");
        System.out.println(" Por favor, digite sua Agencia: ");
        String agencia = scanner.next();
        System.out.println(" Por favor, digite sua Conta: ");
        int conta = scanner.nextInt();
        System.out.println(" Por favor, digite seu nome: ");
        String nome = scanner.next();
        System.out.println(" Por favor, digite seu nome: ");
        String sobrenome = scanner.next();
        System.out.println("Digie o valor do seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá Sr" + nome +" " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +", sua conta é: "+ conta + " e seu saldo: "+ saldo + " já está disponível para saque !");

        /*DIO - Trilha Java Básico
        Numero	Inteiro	1021
        Agencia	Texto	067-8
        Nome Cliente	Texto	MARIO ANDRADE
        Saldo	Decimal	237.48


        Revise sobre terminal, main args e a classe Scanner
        Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
        Programa: "Por favor, digite o número da Agência !"
        Usuário: 1021 (depois ENTER para o próximo campo)
        Revise sobre concatenação e classe String com método concat
        Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
        "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

        Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários. */

    }
}
