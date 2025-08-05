import java.util.InputMismatchException;
import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        int inputNum = 0;
        Scanner sc = null;

        while (true) {
            try {
                // コンソール(ターミナル)に 1 ~ 5 までの整数を入力し、[Enter]
                System.out.print("何段>");
                sc = new java.util.Scanner(System.in);
                inputNum = sc.nextInt();
                if (inputNum < 1 || 5 < inputNum) {
                    System.out.println("1 ~ 5 までの整数を入力してください");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("1 ~ 5 までの整数を入力してください");
                continue;
            }

            for (int i = 1; i <= inputNum; i++) {
                for (int j = 1; j <= inputNum; j++) {
                    if (inputNum < i + j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            sc.close();
            break;
        }

    }

}
