import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite Seu Nome");
        String nome = scanner.next();

        System.out.println("Digite Seu Sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Digite Sua Idade");
        int idade = scanner.nextInt();

        System.out.println("Digite Sua Altura");
        Double altura = scanner.nextDouble();


        System.out.println("Ola, me chamo " + nome + "  " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha Altura é " + altura + " cm ");
    }
}
