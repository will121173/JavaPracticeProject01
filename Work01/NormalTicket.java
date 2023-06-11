package Work01;

public class NormalTicket{


    // 運賃表はDBからの取得を壮丁していますが、今回はモックをおいてあるので以下の関数を代用してください
    private int getNormalPriceFromTable(String a,String b){
        return Work01DBMock.getPriceFromNormalPriceTable(a, b);
    }
}
