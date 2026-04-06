import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class FilaHospital {

    private Queue<Integer> fila;
    private List<Integer> historico;
    private int senhaAtual;

    // Construtor
    public FilaHospital() {
        fila = new LinkedList<>();
        historico = new ArrayList<>();
        senhaAtual = 1;
    }

    // Gerar senha
    public void gerarSenha() {
        fila.add(senhaAtual);
        System.out.println("Senha gerada: " + senhaAtual);
        senhaAtual++;
    }

    // Chamar próximo
    public void chamarProximo() {
        if (!fila.isEmpty()) {
            int atendido = fila.poll();
            historico.add(atendido);

            System.out.println("Chamando senha: " + atendido);
        } else {
            System.out.println("Não há pessoas na fila");
        }
    }

    // Mostrar fila atual
    public void mostrarFila() {
        System.out.println("Fila atual: " + fila);
    }

    // Mostrar histórico
    public void mostrarHistorico() {
        System.out.println("Histórico de chamadas: " + historico);
    }
}