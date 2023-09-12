import java.util.Scanner;
public class SymbolTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість символів для генерації: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Введіть символ: ");
            char c = scanner.next().charAt(0);
            System.out.print(c + ": ");

            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("гласна");
                case 'y', 'w' -> System.out.println("іноді гласна");
                default -> System.out.println("приголосна");
            }
        }
        scanner.close();
    }
}
