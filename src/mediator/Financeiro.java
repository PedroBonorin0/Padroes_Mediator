package mediator;

public class Financeiro {
  private static Financeiro instancia = new Financeiro();

  private Financeiro() {}

  public static Financeiro getInstancia() { return instancia; }

  public String receberPagamentoMensalidade(float valor) {
    return "Mensalidade com valor R$" + String.format("%.2f", valor) + " paga com sucesso.";
  }

  public String receberPagamentoCompraLoja(float valor) {
    return "Compra de valor R$" + String.format("%.2f", valor) + " computada com sucesso.";
  }
}
