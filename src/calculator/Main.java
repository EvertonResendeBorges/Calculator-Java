package calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner s = new Scanner(System.in)) {

			double n1, n2;
			int op;

			do {
				System.out.println("------------");
				System.out.println("Calculations");
				System.out.println("------------");
				System.out.println();
				System.out.println("Choose an option");
				System.out.println("----------------");
				System.out.println("0- Exit");
				System.out.println("1- Add");
				System.out.println("2- Subtract");
				System.out.println("3- Multiply");
				System.out.println("4- Divide");
				System.out.println("5- Rest of Division");
				System.out.println();

				op = s.nextInt();

				System.out.println();

				switch (op) {

				case 0:
					System.out.println("Exit");
					break;

				case 1:
					System.out.println("Add");
					System.out.println("---");
					System.out.println();
					System.out.println("Value 01:");
					n1 = s.nextDouble();
					System.out.println("Value 02:");
					n2 = s.nextDouble();
					System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
					break;

				case 2:
					System.out.println("Subtract");
					System.out.println("--------");
					System.out.println();
					System.out.println("Value 01\n:");
					n1 = s.nextDouble();
					System.out.println("Value 02\n:");
					n2 = s.nextDouble();
					System.out.println(n1 + " - " + n2 + " = " + (n1 - n2) + "\n");
					break;

				case 3:
					System.out.println("Multiply");
					System.out.println("--------");
					System.out.println();
					System.out.println("Value 01:");
					n1 = s.nextDouble();
					System.out.println("Value 02:");
					n2 = s.nextDouble();
					System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
					break;

				case 4:
					System.out.println("Divide");
					System.out.println("------");
					System.out.println();
					System.out.println("Value 01:");
					n1 = s.nextDouble();
					System.out.println("Value 02:");
					n2 = s.nextDouble();
					System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
					break;

				case 5:
					System.out.println("Rest of Division");
					System.out.println("----------------");
					System.out.println();
					System.out.println("Value 01:");
					n1 = s.nextDouble();
					System.out.println("Value 02:");
					n2 = s.nextDouble();
					System.out.println(n1 + " mod " + n2 + " = " + (n1 % n2));
					break;

				default:
					System.out.println("Error");
					System.out.println("-----");
					System.out.println("Invalid option");
				}

			} while (op != 0);

		} catch (Exception e) {
			System.out.println("Invalid values");
		}
	}

}
