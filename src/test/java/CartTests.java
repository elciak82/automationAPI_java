import POJO.AddItemToCart;
import POJO.AddItemToCartByKey;
import POJO.ItemData;
import org.testng.annotations.Test;
import requests.CartEndpoints;
import requests.ItemInCartEndpoints;

import java.util.HashMap;
import java.util.Map;

public class CartTests extends BaseTest {

    private final CartEndpoints cartEndpoints = new CartEndpoints();
    private final ItemInCartEndpoints itemEndpoints = new ItemInCartEndpoints();


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
        queryParams.put("cart_key","9de3cb424340e9cbdc2048b2b8c4e2ca");

        cartEndpoints.getCartByKey(queryParams);

    }

    @Test
    public void getGuestCartByCartKeyTest() { ///nie działa - zwrca pusty
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("cart_key","9de3cb424340e9cbdc2048b2b8c4e2ca");

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

        AddItemToCart requestBody = new AddItemToCart(quantity, id, null);

        cartEndpoints.addItemToCart(requestBody);

    }

    @Test
    public void addItemWithDetailsToCustomerCartTest() {
        String id = "142";
        int quantity = 5;
        String color = "Blue";
        String size = "XXXL";
        ItemData itemData = new ItemData(color, size);

        AddItemToCart requestBody = new AddItemToCart(quantity, id, itemData);

        cartEndpoints.addItemToCart(requestBody);

    }

    @Test
    public void countItemInCustomerCartTest() {
        itemEndpoints.countItemsInCart();

    }

    @Test
    public void viewItemInCustomerCartTest() {
        String itemKey = "9de3cb424340e9cbdc2048b2b8c4e2ca";
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
