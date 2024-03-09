import java.util.ArrayList;
import java.util.List;

public class ModeloAvancado implements Celular {
    private List<String> historicoLigacoes;
    private List<String> historicoMensagens;

    public ModeloAvancado() {
        historicoLigacoes = new ArrayList<>();
        historicoMensagens = new ArrayList<>();
    }

    @Override
    public void ligar() {
        System.out.println("Celular ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Celular desligado");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para " + numero);
        historicoLigacoes.add(numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
        historicoMensagens.add(numero + ": " + mensagem);
    }

    public void exibirHistoricoLigacoes() {
        System.out.println("Histórico de Ligações:");
        for (String ligacao : historicoLigacoes) {
            System.out.println("Ligação para: " + ligacao);
        }
    }

    public void exibirHistoricoMensagens() {
        System.out.println("Histórico de Mensagens:");
        for (String mensagem : historicoMensagens) {
            System.out.println(mensagem);
        }
    }
}