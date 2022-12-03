package bingo;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(".:: Bingo ELSHOHAN ::.");
		System.out.println("1) 90 Bolas");
		System.out.println("2) 75 Bolas");
		System.out.print("Ingrese su opción: ");
		int option = sc.nextInt();
		switch (option) {
			case 1 -> {
				Bingo bingo90 = new Bingo90();
				bingo90.jugar();
			}
			case 2 -> {
				Bingo bingo75 = new Bingo75();
				bingo75.jugar();
			}
		}
	}
}