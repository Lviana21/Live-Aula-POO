import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo Análise Gráfica");
		produto1.setValor(BigDecimal.valueOf(500));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Módulo Gestão de Risco");
		produto2.setValor(BigDecimal.valueOf(400));

		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Módulo Noticias");
		produto3.setValor(BigDecimal.valueOf(200));

		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Módulo Psicologia do Trader ");
		produto4.setValor(BigDecimal.valueOf(400));

		Venda venda = new Venda();
		venda.setDescricaoVenda("Curso Formação Trader");
		venda.setEnderecoEntrega("Entrega por E-mail");
		venda.setId(1L);
		venda.setNomeCliente("Lucas");
		// venda.setValorTotal(Double.valueOf(1600));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); /* Não consigo fazer validações */
		venda.addProduto(produto3);/* Posso fazer validações antes de adicionar na lista */
		venda.addProduto(produto4);

		// System.out.println("Descrição da Venda: " + venda.getDescricaoVenda() + " e o
		// total: " + venda.totalVenda());
		System.out.println("Valor da variável total venda: " + venda.getValorTotal());

		/*for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Produtos: " + produto);

		}*/

	}

}
