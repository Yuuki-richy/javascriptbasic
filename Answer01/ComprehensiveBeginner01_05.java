public class ComprehensiveBeginner01_05 {
    public static void main(String[] args) {
        String foo = "foo";
        String bar = "bar";

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(foo + bar);
            } else if (i % 3 == 0) {
                System.out.println(foo);
            } else if (i % 5 == 0) {
                System.out.println(bar);
            } else {
                System.out.println(i);
            }
        }
    }

}