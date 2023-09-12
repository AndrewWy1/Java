import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringParsing {
    public static void main(String[] args) {
        String fileName = "D:\\Java CHN\\file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Введений рядок: " + line);
                System.out.println("Рядок складається з: ");
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (!token.matches(".*\\d.*")) {
                        System.out.println(token + " - це текст = " + token);
                    } else {
                        System.out.print(token + " - це число = ");
                        try {
                            double number = Double.parseDouble(token);
                            System.out.println(number);
                        } catch (NumberFormatException e) {
                            System.out.println("Немає числа на початку слова");
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
