import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int [] train = new int[n];
        int sum = 0;
        for (int i = 0; i < train.length; i++ ){
            train[i] = Integer.parseInt(sc.nextLine());
        }

        for (int wagon : train) {
            System.out.print(wagon + " ");
            sum += wagon;
        }
        System.out.println();
        System.out.println(sum);
    }
}
