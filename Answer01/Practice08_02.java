import java.util.Random;

class Practice08_02 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);

        System.out.println(age);

        if (age <= 3) {
            System.out.println("あなたは baby です");
        } else if (3 < age && age < 18) {
            System.out.println("あなたは kid です");
        } else if (18 <= age) {
            System.out.println("あなたは adult です");
        }
    }
}