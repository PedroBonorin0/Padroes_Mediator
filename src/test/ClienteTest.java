package test;

import mediator.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

  @Test
  void devePagarMensalidade() {
    Cliente cliente = new Cliente();
    String texto = "O setor financeiro agradece o pagamento\n >>> Mensalidade com valor R$20,00 paga com sucesso.";
    assertEquals(texto, cliente.pagarMensalidade(20));
  }

  @Test
  void devePagarCompraNaLoja() {
    Cliente cliente = new Cliente();
    String texto = "O setor financeiro agradece o pagamento\n >>> Compra de valor R$20,00 computada com sucesso.";
    assertEquals(texto, cliente.comprarNaLoja(20));
  }
}