import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String fileName = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Введений рядок: " + line);
                System.out.println("Складається з: ");
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (!token.matches(".*\\d.*")) {
                        System.out.println(token + " - текст = " + token);
                    } else {
                        System.out.print(token + " - число = ");
                        try {
                            double number = Double.parseDouble(token);
                            System.out.println(number);
                        } catch (NumberFormatException e) {
                            System.out.println("Нема числа на початку слова");
                        }
                    }
                }

                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдений");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
