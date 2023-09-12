import java.io.File;
import java.util.Scanner;

public class DeleteFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // зчитування шляху до каталогу з клавіатури
        System.out.print("Введіть шлях до каталогу: ");
        String directoryPath = scanner.nextLine();

        // перевірка, чи каталог існує
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            System.out.println("Каталогу не існує");
            scanner.close();
            return;
        }

        // отримання списку файлів у каталозі
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Каталог порожній");
            scanner.close();
            return;
        }

        // виведення інформації про файли та запит на підтвердження видалення
        System.out.println("У каталозі " + directoryPath + " знайдено " + files.length + " файлів:");
        for (File file : files) {
            System.out.println(file.getName());
        }
        System.out.print("Видалити ці файли? (Y/N) ");
        String input = scanner.nextLine();
        scanner.close();
        if (!input.equalsIgnoreCase("Y")) {
            System.out.println("Видалення скасовано");
            return;
        }

        // видалення файлів
        for (File file : files) {
            file.delete();
        }
        System.out.println("Файли видалено");
    }
}
