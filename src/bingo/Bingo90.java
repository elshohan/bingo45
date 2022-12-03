package bingo;
import java.util.ArrayList;
import java.util.Scanner;

public class Bingo90 extends Bingo {

	public Bingo90() {
		super(90);
	}

	@Override
	protected void jugar() {
		ArrayList<String> array = new ArrayList<>(90);
		Scanner sc = new Scanner(System.in);
		int times = 1;
		getTablero().inicializar(9, 10);
		while (times != 91) {
			System.out.print("Pulse Enter para sacar bola: ");
			sc.nextLine();
			while (true) {
				Bola bola;
				bola = sacarBola();
				if (array.contains(bola.getValor())) {
				} else {
					array.add(bola.getValor());
					getTablero().imprimirTablero(bola, 9, 10);
					System.out.println("Has tirado estas veces: " + times);
					times++;
					break;
				}
			}
		}
	}
}
