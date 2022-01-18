public class Main {
    public static void main(String[] args) {
        Banco bradesco = new Banco("Bradesco");
        Cliente francisco = new Cliente("Fransisco Xico");
        Cliente frederica = new Cliente("Frederica Fransisca");
        Conta corrente = new ContaCorrente(francisco);
        Conta poupanca = new ContaPoupanca(frederica);

        System.out.println("EXIBINDO CONTAS CRIADAS");
        corrente.exibirInformacoes();
        poupanca.exibirInformacoes();

        System.out.println("DEPOSITANDO");
        corrente.depositar(150);
        poupanca.depositar(200);
        corrente.exibirInformacoes();
        poupanca.exibirInformacoes();

        System.out.println("TRANSFERINDO DA CORRENTE PARA POUPANCA");
        corrente.transferir(50, poupanca);
        corrente.exibirInformacoes();
        poupanca.exibirInformacoes();

        System.out.println("SACANDO DA POUPANCA");
        poupanca.sacar(100);
        corrente.exibirInformacoes();
        poupanca.exibirInformacoes();

    }
}
