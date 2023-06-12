import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int targetNumber = 42; // プログラマによって設定される数

        System.out.println("2桁の正の整数を予想して入力してください。");
        System.out.println("5回まで予想できます。");

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 5) {
            int guessedNumber = scanner.nextInt();

            if (guessedNumber == targetNumber) {
                System.out.println("当たり！");
                break;
            } else {
                System.out.println("外れ！");

                if (guessedNumber > targetNumber) {
                    System.out.println("設定された数よりも大きいです。");
                } else {
                    System.out.println("設定された数よりも小さいです。");
                }

                int difference = Math.abs(guessedNumber - targetNumber);
                if (difference >= 20) {
                    System.out.println("20以上の差があります。");
                }
            }

            attempts++;

            if (attempts < 5) {
                System.out.println("もう一度予想してください。");
            }
        }

        if (attempts >= 5) {
            System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
        }

        scanner.close();
    }
}
