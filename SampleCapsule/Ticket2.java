package SampleCapsule;
// ---------------------------------
//  カプセル化のサンプルのファイルです。
// ---------------------------------
import java.util.Date;

public class Ticket2 {
    // 金額を変え忘れないようにする
    public Date boardingDate;          // 乗車日
    private String boardingStation;     // 乗車駅
    public String gettingOffStation;   // 降車駅
    private int price;                  // 金額
    Ticket2(Date boardingDate, String boardingStation, String gettingOffStation){
        this.boardingDate = boardingDate;
        this.boardingStation = boardingStation;
        this.gettingOffStation = gettingOffStation;
        this.price = getPriceFromPriceTable(boardingStation, gettingOffStation);
    }

    public void ChangeBoardingStation(String x){
        this.boardingStation = x;
        this.price = getPriceFromPriceTable(this.boardingStation, this.gettingOffStation);
    }
    
    public void ChangeGettingOffStation(String x){
        this.gettingOffStation = x;
        this.price = getPriceFromPriceTable(this.boardingStation, this.gettingOffStation);
    }
    
    public int getPriceFromPriceTable(String from, String to){ //発着駅を元に料金表から料金を求める処理のモック
        return 1000;
    }
}

