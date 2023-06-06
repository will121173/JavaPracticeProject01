package Work01;
// ----------------------
// 乗車券と急行券の親クラス
// ----------------------
import java.util.Date;

public class Ticket {
    // あくまでも例なのですべて自由に変えてください
    Date boardingDate;          // 乗車日
    String boardingStation;     // 乗車駅
    String gettingOffStation;   // 降車駅
    int numberOfPeople;         // 人数
    int price;                  // 金額
    Ticket(){ // 作成
    }
    public int getPrice(){ // 金額問合せ
        return this.price;
    }
    private int getNormalPriceFromTable(String a,String b){
        return Work01DBMock.getPriceFromNormalPriceTable(a, b);
    }
}

