import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        char inChar;
        System.out.println("Input symbol");

        try {
            inChar = (char) System.in.read();
            System.out.println("Your sumbol is " + inChar);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}