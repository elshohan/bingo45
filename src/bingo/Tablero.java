package bingo;
import java.util.ArrayList;

public class Tablero {
	private final ArrayList<Bola> tablero;

	public Tablero() {
		this.tablero = new ArrayList<>();
	}

	public void inicializar(int x, int y) {
		System.out.println();
		int valorBola = 1;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				tablero.add(new Bola(valorBola - 1, valorBola + ""));
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
	}

	public void imprimirTablero(Bola bola, int x, int y) {
		System.out.println();
		bola.setValor("[" + bola.getValor() + "]");
		tablero.set(bola.getPosition(), bola);
		int valorBola = 1;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(getBola(valorBola - 1) + "\t");
				valorBola++;
			}
			System.out.println("\n");
		}
		System.out.println("Última bola random: " + bola);
	}

	public Bola getBola(int position) {
		return tablero.get(position);
	}
}
