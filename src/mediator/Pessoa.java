package mediator;

public class Pessoa {

  public String pagarMensalidade(float valor) {
    return Feedback.getInstancia().receberPagamentoMensalidade(valor);
  }

  public String comprarNaLoja(float valor) {
    return Feedback.getInstancia().receberPagamentoCompraLoja(valor);
  }
}
