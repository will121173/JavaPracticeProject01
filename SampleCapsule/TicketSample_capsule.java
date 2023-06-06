package SampleCapsule;
// ---------------------------------
//  カプセル化のサンプルのファイルです。
// ---------------------------------

public class TicketSample_capsule {
    // 自由に使えるようにすべてpublicで定義していたとします
    public String boardingStation;     // 乗車駅
    public String gettingOffStation;   // 降車駅
    public int price;                  // 金額
    TicketSample_capsule(String boardingStation, String gettingOffStation){
        this.boardingStation = boardingStation;
        this.gettingOffStation = gettingOffStation;
        this.price = getPriceFromPriceTable(boardingStation, gettingOffStation);
    }

    public int getPriceFromPriceTable(String from, String to){ //発着駅を元に料金表から料金を求める処理のモック
        return 1000;
    }
}

