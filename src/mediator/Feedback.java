package mediator;

public class Feedback {
  private static Feedback instancia = new Feedback();

  private Feedback() {}

  static Feedback getInstancia() { return instancia; }

  public String receberPagamentoMensalidade(float valor) {
    return "O setor financeiro agradece o pagamento\n >>> " + Financeiro.getInstancia().receberPagamentoMensalidade(valor);
  }

  public String receberPagamentoCompraLoja(float valor) {
    return "O setor financeiro agradece o pagamento\n >>> " + Financeiro.getInstancia().receberPagamentoCompraLoja(valor);
  }
}
