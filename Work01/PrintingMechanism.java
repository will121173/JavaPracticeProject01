package Work01;
// ---------------------------------------------------------------------------------------------------
// 今回のワークに使うファイルです
// 変更の必要はありません
// ---------------------------------------------------------------------------------------------------
public class PrintingMechanism {
    private PrintingMechanism(){} // インスタンス化せずに使うクラスです
    public static void printTicket(String ticketTitle, String ticketText){
        // ticketTitle : 急行券、などの券の名前
        // ticketText : 乗車駅などの情報、改行コード\nを適宜入れること、最終行に改行は不要
        System.out.print("■■■■");
        System.out.print(ticketTitle);
        System.out.print("■■■■\n");
        System.out.println(ticketText);
    }
}
