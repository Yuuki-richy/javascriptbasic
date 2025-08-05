import java.util.Scanner;

public class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {

        System.out.print("1 50 10 と入力してください＞");

        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
    
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
    
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + "番目の要素は " + array[i] + " で、2倍にすると " + array[i] * 2 + " になり、3 で割ったあまりは " + array[i] % 3 + " です" );
        }
    
        sc.close();            
    }
}
