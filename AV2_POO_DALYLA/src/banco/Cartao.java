package banco;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
	
	private int numCartao;
	private int codValidacao;
	private int senha;
	private String nomeCliente;
	private String dataVencimento;
	private List<Fatura> faturas = new ArrayList<>(); //pode existir varias faturas de meses anteriores
	
	
	public int getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}
	public int getCodValidacao() {
		return codValidacao;
	}
	public void setCodValidacao(int codValidacao) {
		this.codValidacao = codValidacao;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public void mulpFatura(Fatura f) {
		this.faturas.add(f);
	}
	

}
