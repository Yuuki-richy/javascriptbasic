import java.util.Random;

public class Practice09_03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = new Random().nextInt(6) + 1;
            System.out.println("num = " + num);
            if (num % 2 == 1) {
                System.out.println(i + " 回目、 " + num + " が出ました");
            }
        }
    }

}