package banco;

public class Teste {

	public static void main(String[] args) {
		
		Cliente c1 = new ClienteMaster();
		Cliente c2 = new ClienteComum();
		Cliente c3 = new ClientePremium();
		Cartao ca1 = new Cartao();
		Cartao ca2 = new Cartao();
		Cartao ca3 = new Cartao();
		Fatura f1 = new Fatura();
		Fatura f2 = new Fatura();
		Fatura f3 = new Fatura();
		
		
		c1.setNome("Maria");
		c1.setEmail("maria@hotmail.com");
		c1.setEndereco("Rua 11");
		c1.setNumConta(974436388);
		c1.setSaldo(19000.00);
		c1.setTelefone(989876999);
		
		c2.setNome("Mateus");
		c2.setEmail("mateus@hotmail.com");
		c2.setEndereco("Rua 10");
		c2.setNumConta(974436328);
		c2.setSaldo(1900.00);
		c2.setTelefone(989896999);
		
		c3.setNome("Ana");
		c3.setEmail("ana@hotmail.com");
		c3.setEndereco("Rua 1");
		c3.setNumConta(934436328);
		c3.setSaldo(1900000.00);
		c3.setTelefone(9896999);
		
		ca1.setCodValidacao(378);
		ca1.setDataVencimento("08/26");
		ca1.setNomeCliente("Maria");
		ca1.setNumCartao(288361873);
		ca1.setSenha(786409);
		
		ca2.setCodValidacao(375);
		ca2.setDataVencimento("08/25");
		ca2.setNomeCliente("Mateus");
		ca2.setNumCartao(288361853);
		ca2.setSenha(786469);
		
		ca3.setCodValidacao(368);
		ca3.setDataVencimento("08/27");
		ca3.setNomeCliente("Ana");
		ca3.setNumCartao(288561873);
		ca3.setSenha(786469);
		
		f1.setDataPagamento("05");
		f1.setDataVencimento("05/08");
		f1.setValor(279.00);
		
		f2.setDataPagamento("04");
		f2.setDataVencimento("04/08");
		f2.setValor(2100.00);
		
		f3.setDataPagamento("07");
		f3.setDataVencimento("09/08");
		f3.setValor(27.00);
		
		ca1.mulpFatura(f1);
		ca2.mulpFatura(f2);
		ca3.mulpFatura(f3);
		
		c1.novoCartao(ca1);
		c2.novoCartao(ca2);
		c3.novoCartao(ca3);
		
		
		System.out.println("email: "+ c1.getNome());
		System.out.println("cartao: "+ c1.retornaCartaoPrincipal().getNumCartao());
		System.out.println("fatura: "+ c1.retornaCartaoPrincipal().retornaFaturaPrincipal().getValor());
		
		System.out.println("email: "+ c2.getNome());
		System.out.println("cartao: "+ c2.retornaCartaoPrincipal().getNumCartao());
		System.out.println("fatura: "+ c2.retornaCartaoPrincipal().retornaFaturaPrincipal().getValor());
		
		System.out.println("email: "+ c3.getNome());
		System.out.println("cartao: "+ c3.retornaCartaoPrincipal().getNumCartao());
		System.out.println("fatura: "+ c3.retornaCartaoPrincipal().retornaFaturaPrincipal().getValor());
		
		
	}

}
