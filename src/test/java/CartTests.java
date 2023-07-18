import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import requests.CartEndpoints;
import requests.ItemInCartEndpoints;

public class CartTests {

    private final CartEndpoints cartEndpoints = new CartEndpoints();
    private final ItemInCartEndpoints itemEndpoints = new ItemInCartEndpoints();

    @BeforeTest
    public void before() {
//        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @Test
    public void getWholeCart() {
        cartEndpoints.getCart();

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

        cartEndpoints.addItemToCart(quantity, id);

    }

    @Test
    public void getItemsFromCart() {
        String id = "142";
        int quantity = 5;

        cartEndpoints.addItemToCart(quantity, id);

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
