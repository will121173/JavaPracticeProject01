package SampleCapsule;
import java.util.Date;

public class DokokanoGamen {
    public static void main(String[] args) {
        
    //画面の初めの方の処理、乗車情報選択処理
    Ticket ticket = new Ticket(new Date(), "St.A", "St.B");

    //どこかのボタンを押したとき、行き先変更処理
    ticket.gettingOffStation = "St.C";
    ticket.price = ticket.getPriceFromPriceTable(ticket.boardingStation, ticket.gettingOffStation);
    
    //どこかのボタンを押したとき、出発地点修正処理
    ticket.boardingStation = "St.D";
    // ↑価格を更新忘れている


    Ticket2 ticket2 = new Ticket2(new Date(), "St.A", "St.B");
    ticket2.ChangeStation("St.C");
    ticket2.



}
}
