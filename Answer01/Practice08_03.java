import java.util.Random;

class Practice08_03 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);

        System.out.println("age = " + age);
        System.out.println("gender = " + gender);

        if (age <= 3 && gender == 0) {
            System.out.println("あなたは babyな男 です");
        } else if (age <= 3 && gender == 1) {
            System.out.println("あなたは babyな女 です");
        } else if (3 < age && age < 6 && gender == 0) {
            System.out.println("あなたは childな男 です");
        } else if (3 < age && age < 6 && gender == 1) {
            System.out.println("あなたは childな女 です");
        } else if (6 <= age && age < 18 && gender == 0) {
            System.out.println("あなたは childな男 です");
        } else if (6 <= age && age < 18 && gender == 1) {
            System.out.println("あなたは childな女 です");
        } else if (18 <= age && gender == 0) {
            System.out.println("あなたは adlutな男 です");
        } else if (18 <= age && gender == 1) {
            System.out.println("あなたは adlutな女 です");
        }            
    }
}