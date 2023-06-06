package Work01;

import java.util.ArrayList;
import java.util.List;

// -------------------------------------------------------------------------------------------
//  今回のワークに使うメインのファイルです
//  配布資料中の「操作機構」に当たる立ち位置ですが、問題文として使うため雰囲気しか似せていません
// -------------------------------------------------------------------------------------------
public class Work01Main {
    public static void main(String[] args) {
        // Work01-01
        // 乗車券をインスタンス化して変数に保持してください。
        // クラス図で、操作機構は「切符」エンティティを持っており、それが今回の乗車券に当たります。
        // 要：NormalTicketクラス（ひとまず継承はなしでも良い）　変数名などはあくまでも1例
        // 例：NormalTicket t = new NormalTicket(引数);
        //     System.out.println("Work01-01");
        //     System.out.println(t);  // 確認の出力
        
        // Work01-02
        // 現在の乗車券に対して、金額問い合わせを実施してください
        // 要：NormalTicket クラス（ひとまず継承はなしでも良い）
        // 例：price = t.getPrice()
        //     System.out.println(price);  // 確認の出力
        
        // Work01-03
        // 乗車券と特急券を2枚ずつ作り、1つのループで和を求めてください
        // 親の持つメソッドは子のクラスから例のように統一的な方法で呼ぶことができます
        // 要：Ticket クラス
        // 例：
            // List<Ticket> list = new ArrayList<Ticket>();
            // list.add(new NormalTicket());
            // list.add(new NormalTicket());
            // list.add(new ExpressTicket());
            // list.add(new ExpressTicket());
            // int totalPrice = 0;
            // for(int i = 0; i < list.size(); i++)
            // {
            //     totalPrice += list.get(i).getPrice();
            // }        
            // System.out.println(totalPrice);  // 確認の出力

    }
}
