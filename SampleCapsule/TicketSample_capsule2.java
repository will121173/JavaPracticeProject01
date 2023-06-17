package SampleCapsule;
// -----------------------------------------
//  カプセル化のサンプルクラスです
//  Work01のチケットとは似た別物です
// -----------------------------------------

public class TicketSample_capsule2 {
    String boardingStation;     // 乗車駅
    private String gettingOffStation;   // 降車駅
    private int price;                  // 金額

    public int getPrice() {
        return price;
    }
    
    TicketSample_capsule2(String boardingStation, String gettingOffStation){
        this.boardingStation = boardingStation;
        this.gettingOffStation = gettingOffStation;
        this.price = getPriceFromPriceTable(boardingStation, gettingOffStation);
    }

    public void ChangeGettingOffStation(String x){
        this.gettingOffStation = x;
        this.price = getPriceFromPriceTable(this.boardingStation, this.gettingOffStation);
    }
    
    private int getPriceFromPriceTable(String from, String to){ //発着駅を元に料金表から料金を求める処理のモック
        return 1000;
    }
    
}

