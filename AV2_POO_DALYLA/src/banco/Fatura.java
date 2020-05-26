package banco;

public class Fatura {
	
	private String dataPagamento;
	private String dataVencimento;
	private double valor;
	private static final double JUROS_DIA = 0.10;
	
	
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public static double getJurosDia() {
		return JUROS_DIA;
	}
	
	
	
}
