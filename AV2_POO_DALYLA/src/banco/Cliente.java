package banco;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int numConta;
	private int telefone;
	private String email;
	private String endereco;
	private double saldo;
	private String nome;
	private List<Cartao> cartoes = new ArrayList<>();
	public enum Categoria{
		COMUM, MASTER,PREMIUM;
	}
	
	protected Categoria categoriaCliente;
	
	public Categoria getCategoriaCliente () {
		return categoriaCliente;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cartao retornaCartaoPrincipal() {
		return this.cartoes.get(0);
	}
	
	public void novoCartao(Cartao c) {
		this.cartoes.add(c);
	}
	
	
	

}
