import java.util.Scanner;

public class Practice07_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1.15を入力してください ＞ ");
        float floatNum = sc.nextFloat();

        System.out.println("入力された値は " + floatNum + " です");

        sc.close();
    }
}
