import java.util.Scanner;

public class Kadai_Joken {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        /* 課題1 */
        System.out.println("1:一般, 2:中・高校生, 3:小学生・幼児");
        System.out.print("入園料の区分を1から3で入力してください：");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.print("入園料金：8,400円");
        } else if (num == 2) {
            System.out.print("入園料金：7,000円");
        } else if (num == 3) {
            System.out.print("入園料金：5,000円");
        } else {
            System.out.print("1から3の数字を入力してください。");
        }
        System.out.println("");
        System.out.println("");

        /* 課題2 */
        System.out.print("数字Aを入力してください：");
        int x = scanner.nextInt();
        System.out.print("数字Bを入力してください：");
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println("大きい数字は" + x + "です。");
        } else if (x < y) {
            System.out.println("大きい数字は" + y + "です。");
        } else {
            System.out.println("AとBは同じ値です。");
        }
        System.out.println("");

        /* 課題3 */
        System.out.print("正の整数を入力してください：");
        int z = scanner.nextInt();
        if (z % 2 == 0) {
            System.out.print(z + "は偶数です。");
        } else {
            System.out.print(z + "は奇数です。");
        }
    }
}

