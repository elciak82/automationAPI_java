import org.testng.annotations.Test;
import requests.CartEndpoints;

public class CartTests {

    private final CartEndpoints getRequests = new CartEndpoints();

    @Test
    public void getCart(){

        getRequests.getCart();

    }
}
