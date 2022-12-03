package bingo;

public class Bola {

	private final int position;
	private String valor;

	public Bola(int position, String valor) {
		super();
		this.position = position;
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getPosition() {
		return position;
	}
	@Override
	public String toString() {
		return valor;
	}
}
