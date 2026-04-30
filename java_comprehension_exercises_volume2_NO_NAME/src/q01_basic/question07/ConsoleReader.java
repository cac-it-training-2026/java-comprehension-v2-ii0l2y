package q01_basic.question07;

import java.util.Scanner;

public class ConsoleReader {
	public static int inputNumber() {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		return value;
	}
}
