import java.util.Random;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        int num = 0;
        int total = 0;
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            num = new Random().nextInt(100) + 1;
            total = total + num;
            array[i] = num;

            if (total > 100) {
                break;
            }
        }

        System.out.println("合計値：" + total);
        System.out.print("入力された数値：");

        for (int i = 0; i < array.length; i++){
            if (i == 0) {
                System.out.print(array[i]);
            } else if (array[i] > 0) {
                System.out.print(", ");
                System.out.print(array[i]);
            } else {
                break;
            }
        }

    }
}
