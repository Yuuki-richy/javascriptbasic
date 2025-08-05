import java.util.Scanner;

public class Practice07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("自然数を入力してください ＞ ");

        int inputNum = sc.nextInt();
        int amari = inputNum % 3;

        sc.close();

        System.out.println(inputNum + " を 3 で割ったあまりは " + amari + " です");
    }
}