package sample;

public class FifthClass {
    public static void main(String[] args) {
        int[] array = new int[20];
        // 配列に値を代入
        for (int i = 0; i < 20; i++) {
            array[i] = i * 5;
        }

        // [0]〜[10]の奇数をカンマ区切りで表示
        for (int i = 0; i <= 10; i++) {
            if (array[i] % 2 != 0) { // 奇数かどうか判定
                if (i < 10) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.print(array[i]);
                }
            }
        }
        
//      "print"は改行せずに出力、"prontln"は改行して出力  
//      "\n"は改行を表すメソッド
        System.out.print("\n");

        // [11]〜[19]の偶数をカンマ区切りで表示
        for (int i = 11; i < 20; i++) {
            if (array[i] % 2 == 0) { // 偶数かどうか判定
                if (i < 19) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.print(array[i]);
                }
            }
        }
    }
}
