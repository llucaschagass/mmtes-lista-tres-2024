import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual menu você deseja testar?");
        System.out.println("1 - Modelo Básico");
        System.out.println("2 - Modelo Avançado");

        int escolha = scanner.nextInt();

        Celular celular;
        if (escolha == 1) {
            System.out.println("Testando Modelo Básico:");
            celular = new ModeloBasico();
        } else if (escolha == 2) {
            System.out.println("Testando Modelo Avançado:");
            celular = new ModeloAvancado();
        } else {
            System.out.println("Escolha inválida. Saindo do programa.");
            return;
        }

        testarCelular(celular);

        scanner.close();
    }

    public static void testarCelular(Celular celular) {
        celular.ligar();
        celular.fazerLigacao("123456789");
        celular.enviarMensagem("987654321", "Olá, como você está?");
        celular.desligar();

        if (celular instanceof ModeloAvancado) {
            ModeloAvancado celularAvancado = (ModeloAvancado) celular;
            celularAvancado.exibirHistoricoLigacoes();
            celularAvancado.exibirHistoricoMensagens();

        }
    }
}