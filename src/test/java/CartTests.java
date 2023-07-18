import org.testng.annotations.Test;
import requests.CartEndpoints;
import requests.ItemEndpoints;

public class CartTests {

    private final ItemEndpoints itemEndpoints = new ItemEndpoints();

    @Test
    public void getItems(){
        itemEndpoints.getItems();

    }
}
