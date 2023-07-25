import POJO.AddItemToCart;
import POJO.AddItemToCartByKey;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import requests.CartEndpoints;
import requests.ItemInCartEndpoints;

import java.util.HashMap;
import java.util.Map;

public class CartTests {

    private final CartEndpoints cartEndpoints = new CartEndpoints();
    private final ItemInCartEndpoints itemEndpoints = new ItemInCartEndpoints();

    @BeforeTest
    public void before() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    } //baseTest

    @Test
    public void getCustomerCartTest() {
        cartEndpoints.getCart();

    }

    @Test
    public void getGuestCartKeyTest() {
        cartEndpoints.getGuestCartKey();

    }

    @Test
    public void mergeItemsFromGuestCustomersCartTest() { ///nie działa - zwrca pusty
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("cart_key","939ae60fc19660610df6202b2b9d2cc9");

        cartEndpoints.getCartByKey(queryParams);

    }

    @Test
    public void getGuestCartByCartKeyTest() { ///nie działa - zwrca pusty
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("cart_key","939ae60fc19660610df6202b2b9d2cc9");

        cartEndpoints.getGuestCartByKey(queryParams);

    }

    @Test
    public void getItemsFromCustomerCartTest() {
        itemEndpoints.getItemsFromCart();

    }

    @Test
    public void clearCustomerCartTest() {
        cartEndpoints.clearCart();

    }

    @Test
    public void addItemToCustomerCartTest() {
        String id = "142";
        int quantity = 5;

        AddItemToCart requestBody = new AddItemToCart(quantity, id);

        cartEndpoints.addItemToCart(requestBody);

    }

    @Test
    public void countItemInCustomerCartTest() {
        itemEndpoints.countItemsInCart();

    }

    @Test
    public void viewItemInCustomerCartTest() {
        String itemKey = "a8baa56554f96369ab93e4f3bb068c22";
        itemEndpoints.viewItemInCart(itemKey);

    }

    @Test
    public void removeItemFromCustomerCartTest() {
        String itemKey = "a8baa56554f96369ab93e4f3bb068c22";
        itemEndpoints.removeItemFromCart(itemKey);

    }

    @Test
    public void addItemToGuestCart() {

        String id = "1696";
        int quantity = 1;
        String cart_key ="9de3cb424340e9cbdc2048b2b8c4e2ca";
        AddItemToCartByKey requestBody = new AddItemToCartByKey(quantity, id, cart_key);

        cartEndpoints.addItemToGuestCart(requestBody);

    }
}
