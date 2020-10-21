import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

public class ExchangeCurrency {
    public static void main(String[] args) {

        ExChangeAPI ex = new ExChangeAPI();
        //getconnection with "USD"
        if (ex.getConnection("USD")){
            System.out.println(ex.getResult());

        }

        System.out.println(ex.getEachRate());
        System.out.println(ex.getEachRate("THB"));

        JSONObject jtext = ex.getEachRate();




    }
}
