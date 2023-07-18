import enums.Endpoints;
import org.testng.annotations.Test;
import requests.CartEndpoints;
import requests.ItemEndpoints;

public class ItemTests {

    private final ItemEndpoints getRequests = new ItemEndpoints();

    @Test
    public void getItems(){

        getRequests.getItems();

    }

    @Test
    public void viewItem(){
        String itemKey = "a8baa56554f96369ab93e4f3bb068c22";
        getRequests.viewItem(itemKey);

    }
}
