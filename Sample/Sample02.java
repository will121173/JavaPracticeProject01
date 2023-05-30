package Sample;

public class Sample02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        // ねこクラス（Cat）へのアクセス。
        cat.bark(); // 鳴き声を聞く。
        cat.changeCry(); // 鳴き声を変える。
        cat.bark(); // 鳴き声を聞く。
    }
}

// ねこクラスをファイル分割
