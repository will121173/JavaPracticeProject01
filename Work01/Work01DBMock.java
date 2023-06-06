package Work01;

public class Work01DBMock {
    // 運賃表のモック
    // 以下のメソッドは固定で1000円を返しますが、本来は発着駅を入れれば料金を返すメソッドと仮定してください
    // より詳細に考えたい場合、後の開発で外部のDBからシンプル検索して持ってくる処理に置き換わると想定してください
    // (その場合引数がテキストで良いのかは今回は気にしないでください)
    public static int getPriceFromNormalPriceTable(String station1, String station2){
        return 1000;
    }
    
    // 料金表のモック
    // 以下のメソッドは固定で2000円を返しますが、本来は発着駅と電車種別を入れれば料金を返すメソッドと仮定してください
    // より詳細に考えたい場合、後の開発で外部のDBからシンプル検索して持ってくる処理に置き換わると想定してください
    // (その場合引数がテキストで良いのかは今回は気にしないでください)
    public static int getPriceFromExpressPriceTable(String station1, String station2, String train){
        return 2000;
    }
}
