class Practice06_04 {
    public static void main(String[] args) {
        int a = 3;
        boolean c = (a == 2 && a < 3);

        System.out.println("a は 2でない かつ、3未満 の結果は " + c + " です");

        int b = 5;
        boolean d = (b == 1 || b >= 5);

        System.out.println("b は 1である または、5以上 の結果は " + d + "です");
    }
}