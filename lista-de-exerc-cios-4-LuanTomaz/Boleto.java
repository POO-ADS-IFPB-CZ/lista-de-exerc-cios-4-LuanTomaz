class Boleto extends Pagamento {
    @Override
    public void processar(double valor) {
        double valorComDesconto = valor * 0.97;
        System.out.printf("Pagamento com Boleto: R$ %.2f (3%% de desconto)%n", valorComDesconto);
    }
}
