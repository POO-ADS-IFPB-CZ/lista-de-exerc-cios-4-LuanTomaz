public class CartaoCredito extends Pagamento{

    @Override
    public void processar(double valor){
        double valorComTaxa = valor * 1.05;
        System.out.printf("Pagamento com Cartão de Crédito: R$ %.2f (5%% de taxa)%n", valorComTaxa);
    }

}
