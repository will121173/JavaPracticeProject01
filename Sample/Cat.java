package Sample;

public class Cat {
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