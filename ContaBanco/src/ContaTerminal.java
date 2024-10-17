import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        //classe scanner para a digitação dos dados pelo usuario
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

        // Aqui exibimos o dados colocados pelo usuario
        System.out.println(" Olá Sr " + nome +" " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +", sua conta é: "+ conta + " e seu saldo: "+ saldo + " já está disponível para saque !");

        System.out.println("");
        System.out.println("");
        System.out.println("CARREGANDO.....");
        System.out.println("");
        System.out.println("");
        System.out.println("PRONTO.....");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(" ->  Conta criada com sucesso! ");
        System.out.println("");
        System.out.println("Bem vindo, " + nome + ", O banco NOVO, agradece o seu cadastro");
        System.out.println("Seu saldo atual é: " + saldo);
    }
}
