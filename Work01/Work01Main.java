package Work01;

import java.util.ArrayList;
import java.util.List;

// -------------------------------------------------------------------------------------------
//  今回のワークに使うメインのファイルです
//  配布資料中の「操作機構」に当たる立ち位置ですが、問題文として使うため雰囲気しか似せていません
//  目的は [1. 良い実装で] [2. 各Workを達成する]  ことです。
// -------------------------------------------------------------------------------------------
public class Work01Main {
    public static void main(String[] args) {
        // Work01-01
        // 乗車券をインスタンス化して変数に保持してください。
        // 乗車券クラスは、クラス図のようにTicketクラスを継承するようにしてください。
        // NormalTicketは乗車駅、降車駅、金額、人数、乗車日の情報を持っている・または求められる必要があります(外から見える必要はない)
        // 要：NormalTicketクラス, Ticketクラス(親クラス)
        //     NormalTicket, Ticketクラスが形だけ用意してあるのでひとまずそれを使い、後のワークで拡張していくのがオススメです。
        // 例：price = t.getPrice()
        //     NormalTicket t = new NormalTicket(引数);
        //     System.out.println("Work01-01");
        //     System.out.println(t);  // 確認の出力:クラス名などが出ればOK

        // Work01-02
        // 現在の乗車券に対して、金額（整数値）を得てください
        // 要：NormalTicketクラスから金額を外に伝える手段
        // 例：price = t.getPrice()
        //     System.out.println(price);  // 確認の出力
        
        // Work01-03
        // 乗車券と特急券を2枚ずつ作り、Ticketクラスの配列としてまとめてください
        // 要：Ticket クラス（親クラス）, ExpressTicketクラス
        // 例：
            // List<Ticket> list = new ArrayList<Ticket>();
            // list.add(new NormalTicket());
            // list.add(new NormalTicket());
            // list.add(new ExpressTicket());
            // list.add(new ExpressTicket());

        // Work01-04
        // 乗車券と特急券を2枚ずつ作り、1つのループで和を求めてください
        // 親の持つメソッドは子のクラスから例のように統一的な方法で呼ぶことができます
        // 例：
            // int totalPrice = 0;
            // for(int i = 0; i < list.size(); i++)
            // {
            //     totalPrice += list.get(i).getPrice();
            // }        
            // System.out.println(totalPrice);  // 確認の出力

    }
}
