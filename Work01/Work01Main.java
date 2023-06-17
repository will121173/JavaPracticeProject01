package Work01;

import java.util.ArrayList;
import java.util.List;
// ---------------------------------------------------------------------------------------------------
// 今回のワークに使うメインのファイルです
// Work01-01～ex　までを実施してください
// 例は引数だけ入れればそのままでも問題ないようにしていますが、変数名や呼び出し方など細部は変更して構いません
// これ以外に同フォルダ内のTicket.java, NormalTicket.java, ExpressTicket.java(作成してください)を使用します
// ---------------------------------------------------------------------------------------------------

public class Work01Main {
    public static void main(String[] args) {
        System.out.println("Work01-01 start");
        // ★ Work01-01 継承
        // 下記の乗車券をインスタンス化して変数に保持してください。
        // ■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■
        // ■　乗車駅 : 名古屋　(文字列)
        // ■　降車駅 : 東京　(文字列)
        // ■　人数 : 2　(整数)
        // ■　乗車日 : システムの今日の日付　(Date型)
        // ■　金額 : 1000　(整数) (手動で入れるのではなく、NormalTicketクラスに用意してある関数で乗降車駅から自動的に求めること)
        // ■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■
        // 乗車券クラスは、クラス図のようにTicketクラスを継承するようにしてください。
        // 要：NormalTicketクラス, Ticketクラス(親クラス)
        //     NormalTicket, Ticketクラスが別ファイルに形だけ用意してあるのでそれを使ってください。
        // 例：
        // NormalTicket nt = new NormalTicket(引数);
        // System.out.println(nt);  // 確認の出力:クラス名などが出ればOK
        System.out.println("Work01-01 end");
        

        System.out.println("Work01-02 start");
        // ★ Work01-02 カプセル化・アクセス修飾子
        // 現在の乗車券に対して、金額（整数値）を得てください
        // 要：NormalTicketクラスから金額を外に伝える手段
        // 例：
        // int price_nt = nt.getTicketPrice()
        // System.out.println(price_nt);  // 確認の出力　(Work1の続きで、2000と出力)
        System.out.println("Work01-02 end");
        
        
        System.out.println("Work01-03 start");
        // ★ Work01-03 カプセル化・アクセス修飾子
        // 現在の特急券に関して、下記のように券の情報をコンソールに出力してください
        // ■■■■急行券■■■■
        // 2023/X/X      　　　　※ここは当日の日付
        // のぞみ
        // 名古屋 >> 東京
        // 2名
        // 4000円
        // ■■■■■■■■■■■■
        // クラス図の乗車券面編集・発券に当たります
        // 印刷機構とその発券メソッドはPrintingMechanism.javaに実装済みです
        // 要：ExpressTicketクラス
        // 例：
        // ExpressTicket et = new ExpressTicket(引数);
        // xxx.yyyy(zzz);  //ここで、適切にメソッドを呼び出す  ※標準出力に上記例と同等の出力
        System.out.println("Work01-03 end");
        

        System.out.println("Work01-04 start");
        // ★ Work01-04 ポリモーフィズム
        // 下記の要件で乗車券と特急券を2枚ずつ作り、Ticketクラスのリストとしてまとめてください
        // ■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■
        // ■　乗車券の人数 : 1と2　(整数)
        // ■　特急券の人数 : 1と3　(整数)
        // ■　※現状、人数しか金額に依存しないので他は適当に
        // ■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■　■
        // その後、リストの金額の和を求めてください
        // 要：Ticket クラス（親クラス）, ExpressTicketクラス
        // 例：
        // List<Ticket> tickets = new ArrayList<Ticket>();
        // list.add(new NormalTicket(引数));
        // list.add(new NormalTicket(引数));
        // list.add(new ExpressTicket(引数));
        // list.add(new ExpressTicket(引数));
        // System.out.println(tickets.size());  // 確認の出力（4と出力）
        // int totalPrice = 0;
        // for(int i = 0; i < tickets.size(); i++){
        //     totalPrice += tickets.get(i).getPrice();
        // }        
        // System.out.println(totalPrice);  // 確認の出力()
        System.out.println("Work01-04 end");


        // ★ Work01-ex 最後に
        // Ticket, NormalTicket, ExpressTicketクラスのアクセス修飾子等を見直して適切にカプセル化、継承がなされている状態にしてください

    }
}
