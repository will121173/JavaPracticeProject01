package SampleCapsule;
import java.util.Date;
// ---------------------------------
//  カプセル化のサンプルのファイルです。
// ---------------------------------
public class SampleCapsuleMain {
    public static void main(String[] args) {
        
    // 1-1. 切符を生成から利用までするクラスがあって、切符インスタンスを生成したとします。
    TicketSample_capsule ticket = new TicketSample_capsule(new Date(), "St.A", "St.B");
    
    // ~~~~~~~~~~~~~~~~~~~~~この間にも色々コードがあるとする~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  //

    // 1-2. どこかのボタンを押したときの処理と仮定して、行き先変更を実施します。
    //    行き先を変更したら、当然値段も変えなければならないとお客様から聞いているので、行き先と値段を変えます。
    //　 　（カプセル化がなされていない例・変数を直接書き換えています。）
    ticket.gettingOffStation = "St.C";
    ticket.price = ticket.getPriceFromPriceTable(ticket.boardingStation, ticket.gettingOffStation);

    // ~~~~~~~~~~~~~~~~~~~~~この間にも色々コードがあって上下は別の関数・クラスとする~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  //

    //　1-3. 後々の改修として、別のどこかのボタンを押したときにも行き先を変更できるようにしました。
    //       直近の処理では金額を扱わなかったこともあり、PJにアサインされて間もない開発者が、言われた通り行き先だけ改修してしまいました
    ticket.gettingOffStation = "St.D";

    //  これは流石にレビューで気づくが、条件が増えたりすると大変。
    // どうすればよかったか　→　「行き先・値段」(フィールド)をprivateにして、「行き先変更」(メソッド)処理を作ってpublicにする

    // 「チケットは、必ず値段が発着駅に合わせられる(+αの条件・子供料金 etc.)」というルールが有るならチケットのクラスにそのルールを実装し、
    //   インスタンス化されたチケットが一時でもルール外の不正な状態にならないようにする

    // 2-1. インスタンス化は同じ
    TicketSample_capsule2 ticket2 = new TicketSample_capsule2(new Date(), "St.A", "St.B");
    // 2-2. ticket2はpriceやgettingOffStationを公開しておらず、ChangeGettingOffStationでpriceも含めた内部状態を変更する
    ticket2.ChangeGettingOffStation("St.C");

    // 補足1. priceは公開していないので値段が知りたいときはgetメソッドを用意する
    // ただし、理想的には単なるgetメソッドよりも、具体的な処理(チケット印刷など)として実装したほうが結合度が低くなって良い
    System.out.println(ticket2.getPrice());

    // 補足2. 
    // Q. これはどちらかというとカプセル化というより処理の共通化・DRY(繰り返さない)の問題では？
    // A. publicメソッドの実装だけでサンプルコードは動くが、フィールドがpublicのままだと開発者にとって実装方法が2パターン見えてしまう。

}
}
