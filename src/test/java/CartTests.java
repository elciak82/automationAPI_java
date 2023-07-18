import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import requests.CartEndpoints;

public class CartTests {

    private final CartEndpoints getRequests = new CartEndpoints();

    @BeforeTest
    public void before(){
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @Test
    public void getCart(){
        getRequests.getCart();

    }

    @Test
    public void clearCart(){
        getRequests.clearCart();

    }

    @Test
    public void addItemToCart(){
        String id = "142";
        int quantity = 5;
        boolean returnCart = true;

        getRequests.addItemToCart(quantity, id, returnCart);

    }

    @Test
    public void getItemsFromCart(){
        String id = "142";
        int quantity = 5;
        boolean returnCart = true;

        getRequests.addItemToCart(quantity, id, returnCart);

    }

    @Test
    public void countItemInCart(){

        getRequests.countItemsInCart();

    }
}
