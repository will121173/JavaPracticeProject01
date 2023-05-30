package Sample;

public class Sample01 {
    public static void main(String[] args) {
        Cat1101 cat = new Cat1101();
        // ねこクラス（Cat1101）へのアクセス。
        cat.bark(); // 鳴き声を聞く。
        cat.changeCry(); // 鳴き声を変える。
        cat.bark(); // 鳴き声を聞く。
    }
}

// ねこクラス
class Cat1101 {
    // private修飾子により、外部から直接このcry変数（鳴き声）が変更されることはありません。
    private String cry = "ニャンニャンニャン";

    // cry変数（鳴き声）を出力するのはこのメソッドのみです。
    public void bark() {
        System.out.println("ねこ ： " + cry);
    }

    // cry変数（鳴き声）を変更できるのはこのメソッドのみです。
    public void changeCry() {
        this.cry = "ニャ～オ";
    }
}
