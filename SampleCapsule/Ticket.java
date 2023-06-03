package SampleCapsule;
// ---------------------------------
//  カプセル化のサンプルのファイルです。
// ---------------------------------
import java.util.Date;

public class Ticket {
    // 自由に使えるようにすべてpublicで定義していたとします
    public Date boardingDate;          // 乗車日
    public String boardingStation;     // 乗車駅
    public String gettingOffStation;   // 降車駅
    public int price;                  // 金額
    Ticket(Date boardingDate, String boardingStation, String gettingOffStation){
        this.boardingDate = boardingDate;
        this.boardingStation = boardingStation;
        this.gettingOffStation = gettingOffStation;
        this.price = getPriceFromPriceTable(boardingStation, gettingOffStation);
    }

    public int getPriceFromPriceTable(String from, String to){ //発着駅を元に料金表から料金を求める処理のモック
        return 1000;
    }
}

