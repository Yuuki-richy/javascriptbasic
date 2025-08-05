import java.util.Random;

class Practice08_01 {
    public static void main(String[] args) {
        int gender = new Random().nextInt(2);

        System.out.println(gender);

        if (gender == 0) {
            System.out.println("あなたは 男 です");
        } else {
            System.out.println("あなたは 女 です");
        }
    }
}