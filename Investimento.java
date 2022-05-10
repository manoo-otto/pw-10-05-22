
public class Investimento {
	private double valor;
	private String tipo;
	
	
	public double correcao() {
		if(this.tipo.equals("Poupança") || this.tipo.equals("P")) {
			this.valor = this.valor + (this.valor * 0.03);
		} else {
			this.valor = this.valor + (this.valor * 0.04);
		}
		
		return valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
