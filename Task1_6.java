/**
 * Task1-6: 課題内容
 *
 * 本課題では、すべての定数(合計６種類)を使いつつ、if文の使い方に慣れていきましょう！
 * 問① 〜 問⑤まで回答お願いします！
 *
 * @author s.nanaumi
 */
public class Task1_6 {

    // 定数（条件）
    // ① 名前とパスワードの定数を定義してください。
    // 補足:
    //   定数は②〜⑤で使い回すために定義しておきます。
    //   final修飾子を付与すると、変数（動的に変わる値）ではなく、定数（変更不可な定まった値）となります。
    //   「ここへ記述」部分へ適当な値を記述しましょう。
    //   ※詳しくはJava2-10のwikiにて紹介します。
    private static final String CONST_ALICE = "alice";
    private static final String CONST_PASS = "disney";

    // 定数（メッセージ）
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";

    public static void main(String[] args) {

        // 以下の変数「name（名前）」「pass（パスワード）」を使用して、②〜⑤の条件を満たす処理を記述してください。
        // 名前とパスワードは画面からの入力値だと想定してみましょう。
        String name = "alice";
        String pass = "disney";

        // ② 名前が「 alice 」、パスワードが「 pass 」であった場合、「 ログイン成功です 」と出力してください。
        if (name.equals(CONST_ALICE) && pass.equals(CONST_PASS)) {
            System.out.println(CONST_MSG_SUCCESS);
        // ③ 名前のみ正しい場合、「 パスワードに誤りがあります。 」と出力してください。
        } else if (name.equals(CONST_ALICE)) {
            System.out.println(CONST_MSG_ERROR_NAME);
        // ④ パスワードのみ正しい場合、「 名前に誤りがあります。 」と出力してください。
        } else if (name.equals(CONST_PASS)) {
            System.out.println(CONST_MSG_ERROR_PASS);
        // ⑤ 名前もパスワードも間違っていた場合は、「 入力情報に誤りがあります。 」と出力してください。
        } else {
            System.out.println(CONST_MSG_ERROR_INPUT);
        }
    }
}
