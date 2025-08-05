import java.util.Random;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        int man = new Random().nextInt(3) + 1;
        int woman = new Random().nextInt(3) + 1;
        int child = new Random().nextInt(3) + 1;

        System.out.println("man = " + man);
        System.out.println("woman = " + woman);
        System.out.println("child = " + child);

        if ((man == woman && man == child) || (man != woman && woman != child && man != child)) {
            System.out.println("あいこです");
        } else if (man == 3) {
            if (woman == 3) {
                if (child == 1) {
                    System.out.println("child が勝ちました");
                } else {
                    System.out.println("man と woman が勝ちました");
                }
            } else if (woman == 2) {
                if (child == 2) {
                    System.out.println("man が勝ちました");
                } else {
                    System.out.println("man と child が勝ちました");
                }
            } else {
                if (child == 3) {
                    System.out.println("woman が勝ちました");
                } else {
                    System.out.println("woman と child が勝ちました");
                }
            }
        } else if (man == 2) {
            if (woman == 3) {
                if (child == 2) {
                    System.out.println("woman が勝ちました");
                } else {
                    System.out.println("woman と child が勝ちました");
                }
            } else if (woman == 2) {
                if (child == 3) {
                    System.out.println("child が勝ちました");
                } else {
                    System.out.println("man と woman が勝ちました");
                }
            } else {
                if (child == 1) {
                    System.out.println("man が勝ちました");
                } else {
                    System.out.println("man と child が勝ちました");
                }
            }
        } else if (man == 1) {
            if (woman == 3) {
                if (child == 3) {
                    System.out.println("man が勝ちました");
                } else {
                    System.out.println("man と child が勝ちました");
                }
            } else if (woman == 2) {
                if (child == 1) {
                    System.out.println("woman が勝ちました");
                } else {
                    System.out.println("woman と child が勝ちました");
                }
            } else {
                if (child == 2) {
                    System.out.println("child が勝ちました");
                } else {
                    System.out.println("man と woman が勝ちました");
                }
            }
        }
    }
}
