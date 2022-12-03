package bingo;
import java.util.ArrayList;
import java.util.Scanner;

public class Bingo75 extends Bingo {

    public Bingo75() {
        super(75);
    }

    @Override
    protected void jugar() {
        ArrayList<String> array = new ArrayList<>(75);
        Scanner sc = new Scanner(System.in);
        int times = 1;
        getTablero().inicializar(5, 15);
        while (times != 76) {
            System.out.print("Pulse Enter para sacar bola: ");
            sc.nextLine();
            while (true) {
                Bola bola;
                bola = sacarBola();
                if (array.contains(bola.getValor())) {
                } else {
                    array.add(bola.getValor());
                    getTablero().imprimirTablero(bola, 5, 15);
                    System.out.println("Has tirado estas veces: " + times);
                    times++;
                    break;
                }
            }
        }
    }
}
