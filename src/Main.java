public class Main {

    public static void main(String[] args) {
        Cliente lee = new Cliente("Lee", "123.456.789-00");

        Conta cc = new ContaCorrente(lee);
        Conta poupanca = new ContaPoupanca(lee);

        Banco banco = new Banco("Banco Exemplo");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Buscar conta pelo número
        Conta contaEncontrada = banco.buscarConta(cc.getNumero());
        if (contaEncontrada != null) {
            System.out.println("Conta encontrada: " + contaEncontrada.getTipoConta());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

}