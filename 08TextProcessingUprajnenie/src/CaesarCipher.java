import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++){
            char ciphered = (char) (message.charAt(i) + 3);
            result.append(ciphered);
        }
        System.out.println(result);
    }
}
