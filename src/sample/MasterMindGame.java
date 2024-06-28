package sample;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * ゲームのルールは次のようにします。 
 * (1)プログラムが1から9までの数字を使った4桁の数字を作成します。(課題1と同様に、乱数を使用) 
 * (2)4桁の数には、同じ数字が2回以上出現しないようにします。 
 * (3)プレイヤーは4桁の数字を入力していきプログラムが作成した数字を当てます。 
 * (4)プレイヤーが入力した数字に対しプログラムは、何個の数字が一致しているか調べ表示します。
 *    また数字の場所も一致している数字は別にその個数を表示します。 
 * (5)プレイヤーはそのヒントを参考にして数字を当てます。ヒントをよく考えて少ない回数で数字を当てることを競います。 
 * (6)正解の場合は、回数を表示して終了します。 (正解以外は、正解するまで繰り返す)
 */
public class MasterMindGame {
    private static final int DIGITS = 4; // 4桁の数字
    private static final int MIN_VALUE = 1111; // 最小値
    private static final int MAX_VALUE = 9999; // 最大値

    private int[] secretNumber; // プログラムが生成した秘密の数字

    // コンストラクタ
    public MasterMindGame() {
        generateSecretNumber();
    }

    // プログラムが生成した秘密の数字を生成するメソッド
    private void generateSecretNumber() {
        Random random = new Random();
        Set<Integer> digits = new HashSet<>();
        
        // 重複のない4桁の数字を生成する
        while (digits.size() < DIGITS) {
            int digit = random.nextInt(9) + 1; // 1から9までの数字を生成
            digits.add(digit);
        }
        
        secretNumber = new int[DIGITS];
        int index = 0;
        for (int digit : digits) {
            secretNumber[index++] = digit;
        }
    }

    // プレイヤーの入力を受け取り、判定するメソッド
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int[] guess;

        int attempts = 0;
        do {
            System.out.printf("%d桁の数字を入力してください。(1111~9999)%n", DIGITS);
            String input = scanner.next();
            guess = convertInputToDigits(input);

            if (guess == null) {
                System.out.println("数字ではありません。もう一度入力してください。");
                continue;
            }

            if (guess.length != DIGITS) {
                System.out.println("4桁で入力してください。もう一度入力してください。");
                continue;
            }

            attempts++;
            evaluateGuess(guess);
        } while (!isCorrectGuess(guess));

        System.out.printf("%d回で当たりです。%n", attempts);
    }

    // プレイヤーが入力した数字を評価し、ヒントを表示するメソッド
    private void evaluateGuess(int[] guess) {
        int correctPlaceAndValue = 0;
        int correctValueOnly = 0;

        for (int i = 0; i < DIGITS; i++) {
            if (guess[i] == secretNumber[i]) {
                correctPlaceAndValue++;
            } else if (containsDigit(guess[i])) {
                correctValueOnly++;
            }
        }

        System.out.printf("場所と値が同じ数 : %d 値が同じで場所が異なる数 : %d%n", correctPlaceAndValue, correctValueOnly);
    }

    // プレイヤーの入力が正しいかチェックし、配列に変換するメソッド
    private int[] convertInputToDigits(String input) {
        if (input.matches("\\d{" + DIGITS + "}")) {
            int[] digits = new int[DIGITS];
            for (int i = 0; i < DIGITS; i++) {
                digits[i] = Character.getNumericValue(input.charAt(i));
            }
            return digits;
        }
        return null;
    }

    // プレイヤーが正解したかどうかを確認するメソッド
    private boolean isCorrectGuess(int[] guess) {
        for (int i = 0; i < DIGITS; i++) {
            if (guess[i] != secretNumber[i]) {
                return false;
            }
        }
        return true;
    }

    // 秘密の数字に特定の数字が含まれているかをチェックするメソッド
    private boolean containsDigit(int digit) {
        for (int i = 0; i < DIGITS; i++) {
            if (secretNumber[i] == digit) {
                return true;
            }
        }
        return false;
    }

    // メインメソッド
    public static void main(String[] args) {
        MasterMindGame game = new MasterMindGame();
        game.playGame();
    }
}