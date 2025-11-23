public class TestePolimorfismo {
    public static void main(String[] args) {

        MetodoPagamento m1 = new CartaoCredito("1234 5555 8888 0000");
        MetodoPagamento m2 = new Boleto("34191.79001.01043.510047.910200.001234");
        MetodoPagamento m3 = new Pix("rafael@email.com");

        ProcessadorPagamento.processar(m1, 150.75);
        ProcessadorPagamento.processar(m2, 499.00);
        ProcessadorPagamento.processar(m3, 25.50);
    }
}
