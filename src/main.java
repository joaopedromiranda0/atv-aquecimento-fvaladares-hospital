public class main {
    public static void main(String[] args) {

        FilaHospital fh = new FilaHospital();

        fh.gerarSenha();
        fh.gerarSenha();
        fh.gerarSenha();

        fh.mostrarFila();

        fh.chamarProximo();
        fh.chamarProximo();

        fh.mostrarFila();
        fh.mostrarHistorico();
    }
}