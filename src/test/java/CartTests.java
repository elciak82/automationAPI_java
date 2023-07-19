import POJO.AddItemToCartRequest;
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
    }

    @Test
    public void getWholeCartTest() {
        cartEndpoints.getCart();

    }

    @Test
    public void getGuestCartKeyTest() {
        cartEndpoints.getGuestCartKey();

    }

    @Test
    public void getGuestCartByCartKey() {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("cart_key","c5fd5ee2e5c2acca91ca3a73b2fef950");

        cartEndpoints.getGuestCartByKey(queryParams);

    }

    @Test
    public void getItems() {
        itemEndpoints.getItemsFromCart();

    }

    @Test
    public void clearCart() {
        cartEndpoints.clearCart();

    }

    @Test
    public void addItemToCart() {
        String id = "142";
        int quantity = 5;

        AddItemToCartRequest requestBody = new AddItemToCartRequest(quantity, id);

        cartEndpoints.addItemToCart(requestBody);

    }

    @Test
    public void getItemsFromCart() {
        String id = "142";
        int quantity = 5;

        AddItemToCartRequest requestBody = new AddItemToCartRequest(quantity, id);

        cartEndpoints.addItemToCart(requestBody);

    }

    @Test
    public void countItemInCart() {
        itemEndpoints.countItemsInCart();

    }

    @Test
    public void viewItemInCart() {
        String itemKey = "a8baa56554f96369ab93e4f3bb068c22";
        itemEndpoints.viewItemInCart(itemKey);

    }

    @Test
    public void removeItemFromCart() {
        String itemKey = "a8baa56554f96369ab93e4f3bb068c22";
        itemEndpoints.removeItemFromCart(itemKey);

    }
}
