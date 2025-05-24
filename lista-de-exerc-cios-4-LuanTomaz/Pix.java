class Pix extends Pagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Pagamento com Pix: R$ %.2f (sem taxas)%n", valor);
    }
}