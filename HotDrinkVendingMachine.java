import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List <HotDrink> hotDrinks = new ArrayList<>();
    private List<Product> productList;
    

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void initProduct(List<Product> productList){
        for (Product i : productList){
            hotDrinks.add((HotDrink)i);
        }
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int temperature) {
        for (Product product : productList) {
            if (product instanceof HotDrink) {
                if (product.getName().equals(name) && ((HotDrink) product).getTemperature() == temperature) {
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }
}
