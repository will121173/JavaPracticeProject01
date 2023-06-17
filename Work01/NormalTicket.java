package Work01;

public class NormalTicket{


    // 運賃表はDBからの取得を想定していますが、今回はモックをおいてあるので以下の関数で運賃を求めることで代用してください
    private int getNormalPriceFromTable(String a,String b){
        return Work01DBMock.getPriceFromNormalPriceTable(a, b);
    }
}
