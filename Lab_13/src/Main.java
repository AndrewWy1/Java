import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шлях до файлу: ");
        String fileName = scanner.nextLine();
        String thisLine;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader fin = null;
        try {
            fin = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while ((thisLine = fin.readLine()) != null) {
                System.out.println("Введена стрічка:" + thisLine);
                list.add(thisLine);
            }
            Collections.sort(list);
            System.out.println("Відсортований лист стрічок:");
            Iterator<String> iter = list.iterator();
            while (iter.hasNext()) {
                String str = iter.next();
                System.out.println(str);
            }
            System.out.print("Введіть стрічку для пошуку: ");
            String searchStr = scanner.nextLine();
            int index = Collections.binarySearch(list, searchStr);
            if (index >= 0) {
                System.out.println("Срічка " + searchStr + " не знайдено " + index);
            } else {
                System.out.println("Срічка " + searchStr + " ну знайдено");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено: " + fileName);
            System.out.println("Помилка: " + e);
        } catch (IOException e) {
            System.out.println("Помилка вводу/вивіду. Файл " + fileName);
            System.out.println("Помилку: " + e);
        } finally {
            if (fin != null)
                try {
                    fin.close();
                } catch (IOException ex) {
                    System.out.println("Помилка вводу " + fileName);
                    System.out.println("Помилка: " + ex);
                }
            fin = null;
        }
    }
}
