public class Main {
    public static void main(String[] args) {
        Pagamento pagamento;

        pagamento = new CartaoCredito();
        pagamento.processar(100.00);

        pagamento = new Boleto();
        pagamento.processar(100.00);

        pagamento = new Pix();
        pagamento.processar(100.00);
    }
}
